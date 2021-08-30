package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ChiTietPhieuThu;
import com.example.demo.Model.NguyenLieu;
import com.example.demo.Model.PhieuThu;
import com.example.demo.Respository.ChiTietPhieuThuRespository;
import com.example.demo.Respository.NguyenLieuRespository;
import com.example.demo.Respository.PhieuThuRespsitory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
public class PhieuThuController {
	@Autowired
	ChiTietPhieuThuRespository ctptRespository;
	@Autowired
	PhieuThuRespsitory ptRespsitory;
	@Autowired
	NguyenLieuRespository nlRespository;

	ValidatorFactory valFac = Validation.buildDefaultValidatorFactory();
	Validator val = valFac.getValidator();

	@PostMapping(value = "/phieuthu/themchitietphieunhap")
	public void ThemChiTietPhieu(@RequestBody String chiTietPhieuThu) {
		Gson gson = new Gson();
		ChiTietPhieuThu ct = gson.fromJson(chiTietPhieuThu, ChiTietPhieuThu.class);

		Set<ConstraintViolation<ChiTietPhieuThu>> violation = val.validate(ct);
		Optional<NguyenLieu> op = Optional.empty();
		if (violation.size() == 0 && nlRespository.findById(ct.getNguyenLieu().getId()) != op) {
			PhieuThu ptCurrent = ptRespsitory.findById(ct.getPhieuThu().getId()).get();
			NguyenLieu nlCurrent = nlRespository.findById(ct.getNguyenLieu().getId()).get();

			nlCurrent.setSoLuongKho(nlCurrent.getSoLuongKho() - ct.getSoLuongBan());
			ptCurrent.setThanhTien(ptCurrent.getThanhTien() + ct.getSoLuongBan() * nlCurrent.getGiaBan());
			Set<ConstraintViolation<PhieuThu>> violation_pt = val.validate(ptCurrent);
			Set<ConstraintViolation<NguyenLieu>> violation_nl = val.validate(nlCurrent);
			if (violation_nl.size() == 0 && violation_pt.size() == 0) {
				ctptRespository.save(ct);
				ptRespsitory.save(ptCurrent);
				nlRespository.save(nlCurrent);
			}

		}
	}

	@PutMapping(value = "/phieuthu/them")
	public void ThemPhieuThu(@RequestBody String phieuThu) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		PhieuThu ptMoi = gson.fromJson(phieuThu, PhieuThu.class);

		Set<ConstraintViolation<PhieuThu>> violation = val.validate(ptMoi);
		if (violation.size() == 0) {
			ptRespsitory.save(ptMoi);
		}
		List<ChiTietPhieuThu> lst = new ArrayList<ChiTietPhieuThu>(ptMoi.getChiTietPhieuThus());
		lst.forEach(ct -> {
			Optional<NguyenLieu> op = Optional.empty();
			if (nlRespository.findById(ct.getNguyenLieu().getId()) != op) {
				NguyenLieu nlCurrent = nlRespository.findById(ct.getNguyenLieu().getId()).get();
				PhieuThu pthu = ptRespsitory.findById(ptMoi.getId()).get();
				ct.setPhieuThu(pthu);
				nlCurrent.setSoLuongKho(nlCurrent.getSoLuongKho() - ct.getSoLuongBan());
				pthu.setThanhTien(pthu.getThanhTien() + ct.getSoLuongBan() * nlCurrent.getGiaBan());
				Set<ConstraintViolation<NguyenLieu>> violation_nl = val.validate(nlCurrent);
				Set<ConstraintViolation<ChiTietPhieuThu>> violation_ctpt = val.validate(ct);
				if (violation_ctpt.size() == 0 && violation_nl.size() == 0) {
					ctptRespository.save(ct);
					ptRespsitory.save(pthu);
					nlRespository.save(nlCurrent);

				}

			}

		}

		);
	}
	
	@DeleteMapping(value = "/phieuthu/xoa")
	public void XoaPhieuThu(@RequestParam int phieuThuID) {
		try {
			ctptRespository.findAll().forEach(x->{
				if (x.getPhieuThu().getId() == phieuThuID) {
					ctptRespository.delete(x);
				}
				
			});
			ptRespsitory.deleteById(phieuThuID);
		} catch (Exception e) {
			System.out.println("khong xoa duoc");
		}
		
	}
	@GetMapping(value = "/phieuthu/laythongtin")
	public List<PhieuThu> Get(@RequestParam(value = "thang", required = false) Integer thang){
		Calendar cl= Calendar.getInstance();
		if (thang == null) {
			return ptRespsitory.findAll();
		}else {
			List<PhieuThu> lst = new ArrayList<PhieuThu>();
			for (PhieuThu x : ptRespsitory.findAll()) {
				cl.setTime(x.getNgayLap());
				if (cl.get(Calendar.MONTH)+1 == thang) {
					lst.add(x);
				}
			}
			return lst;
		}
	}
}
