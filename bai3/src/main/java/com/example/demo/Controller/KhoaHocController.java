package com.example.demo.Controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.HocVien;
import com.example.demo.Model.KhoaHoc;
import com.example.demo.Respository.HocVienRespository;
import com.example.demo.Respository.KhoaHocRespository;

@RestController
public class KhoaHocController {

	@Autowired
	KhoaHocRespository kRespository;
	@Autowired
	HocVienRespository hRespository;

	@PutMapping(value = "/khoahoc/themngay")
	public void ThemNgayChoKhoaHoc(@RequestParam int khoaHocID) {

		KhoaHoc khCurrent = kRespository.findById(khoaHocID).get();

		Calendar c = Calendar.getInstance();
		c.setTime(khCurrent.getNgayKetThuc());
		c.add(Calendar.DAY_OF_MONTH, 1);
		khCurrent.setNgayKetThuc(new Date(c.getTime().getTime()));
		ValidatorFactory valFac = Validation.buildDefaultValidatorFactory();
		Validator val = valFac.getValidator();
		Set<ConstraintViolation<KhoaHoc>> violation = val.validate(khCurrent);
		violation.forEach(x -> {
			System.out.println(x.getMessage());
		});
		if (violation.size() == 0) {
			kRespository.save(khCurrent);
		}
	}

	@DeleteMapping(value = "/khoahoc/xoa")
	public String XoaKhoaHoc(@RequestParam int khoaHocID) {
		Optional<KhoaHoc> op = Optional.empty();
		if (kRespository.findById(khoaHocID) == op) {
			return "khong ton tai khoa hoc";
		} else {
			hRespository.findAll().forEach(x -> {
				if (x.getKhoaHoc().getId() == khoaHocID) {
					x.setKhoaHoc(kRespository.findById(0).get());
					hRespository.save(x);
				}

			});
			kRespository.deleteById(khoaHocID);
			return "thanh cong";
		}

	}

	@GetMapping(value = "/khoahoc/doanhthu")
	public String TinhDoanhThu() {
		String strResult = "";
		Calendar c = Calendar.getInstance();
		for (int i = 0; i < 12; i++) {
			int doanhThu = 0;
			for (KhoaHoc kh : kRespository.findAll()) {
				c.setTime(kh.getNgayBatDau());
				if (c.get(Calendar.MONTH) == i) {
					for (HocVien hv : hRespository.findAll()) {
						if (hv.getKhoaHoc() == kh) {
							doanhThu += kh.getHocPhi();
						}

					}

				}

			}
			strResult += "thang " + String.valueOf(i + 1) + " : " + String.valueOf(doanhThu) + "\n";
		}
		return strResult;
	}
}
