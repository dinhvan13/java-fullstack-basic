package com.example.demo.bai1.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bai1.Model.HocSinh;
import com.example.demo.bai1.Model.Lop;
import com.example.demo.bai1.Respository.HocSinhRespository;
import com.example.demo.bai1.Respository.LopRespository;
import com.google.gson.Gson;

@RestController
public class HocSinhController {

	@Autowired
	LopRespository lopRespository;
	@Autowired
	HocSinhRespository hocSinhRespository;

	public void CapNhatSiSo(int lopID) {
		Lop lp = lopRespository.findById(lopID).get();
		int siSo = 0;
		for (HocSinh hs : hocSinhRespository.findAll()) {
			if (hs.getLop().getId() == lopID) {
				siSo++;
			}
		}
		lp.setSiSo(siSo);
		lopRespository.save(lp);
	}
	@GetMapping(value ="/hocsinh",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<HocSinh> getHocSinh() {
		return hocSinhRespository.findAll();
	}

	public boolean KiemTra(int lopID) {
		Lop lp = lopRespository.findById(lopID).get();
		int siSo = lp.getSiSo() + 1;
		lp.setSiSo(siSo);
		ValidatorFactory valfac = Validation.buildDefaultValidatorFactory();
		Validator validator = valfac.getValidator();
		Set<ConstraintViolation<Lop>> violation = validator.validate(lp);
		violation.forEach(x -> {
			System.out.println(x.getMessage());
		});
		if (violation.size() == 0)
			return true;
		return false;
	}

	@PostMapping(value = "/hocsinh/them", produces = MediaType.APPLICATION_JSON_VALUE)
	public void ThemHocSinh(@RequestBody String hocSinh) {
		Gson gson = new Gson();
		HocSinh hsMoi = gson.fromJson(hocSinh, HocSinh.class);
		ValidatorFactory valfac = Validation.buildDefaultValidatorFactory();
		Validator validator = valfac.getValidator();
		Set<ConstraintViolation<HocSinh>> violation = validator.validate(hsMoi);

		violation.forEach(x -> {
			System.out.println(x.getMessage());
		});
		if (violation.size() == 0) {
			System.out.println(hsMoi.getLop().getId());
			if (KiemTra(hsMoi.getLop().getId())) {
				hocSinhRespository.save(hsMoi);
				CapNhatSiSo(hsMoi.getLop().getId());
			}
		}
	}

	@DeleteMapping(value = "/hocsinh/xoa")
	public void XoaHocSinh(@RequestParam int hocSinhID) {
		try {
			if (!hocSinhRespository.findById(hocSinhID).get().getHoTen().isEmpty()) {
				int lopID = hocSinhRespository.findById(hocSinhID).get().getLop().getId();
				hocSinhRespository.deleteById(hocSinhID);
				CapNhatSiSo(lopID);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("khong xoa duoc");
		}

	}

	@PutMapping(value = "/hocsinh/sua")
	public void SuaHocSinh(@RequestBody String hocSinh) {
		Gson gson = new Gson();
		HocSinh hs = gson.fromJson(hocSinh, HocSinh.class);
		ValidatorFactory valfac = Validation.buildDefaultValidatorFactory();
		Validator validator = valfac.getValidator();
		Set<ConstraintViolation<HocSinh>> violation = validator.validate(hs);
		violation.forEach(x -> {
			System.out.println(x.getMessage());
		});
		if (violation.size() == 0) {

			HocSinh hsCurrent = hocSinhRespository.findById(hs.getId()).get();
			// int lopID1 = hsCurrent.getLop().getId();
			hsCurrent.setHoTen(hs.getHoTen());
			hsCurrent.setNamSinh(hs.getNamSinh());
			hsCurrent.setQueQuan(hs.getQueQuan());
			hocSinhRespository.save(hsCurrent);
			// CapNhatSiSo(hs.getLop().getId());
			// CapNhatSiSo(lopID1);

		}
	}

	@PutMapping(value = "/hocsinh/chuyenlop")
	public void ChuyenＬop(@RequestParam int hocSinhID, int lopID) {
		HocSinh hsCurrent = hocSinhRespository.findById(hocSinhID).get();
		Lop lopCu = hsCurrent.getLop();
		hsCurrent.setLop(lopRespository.findById(lopID).get());
		CapNhatSiSo(lopCu.getId());
		CapNhatSiSo(lopID);

	}

}
