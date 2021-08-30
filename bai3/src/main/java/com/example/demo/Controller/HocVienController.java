package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.HocVien;
import com.example.demo.Respository.HocVienRespository;
import com.example.demo.Respository.KhoaHocRespository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
public class HocVienController {
	@Autowired
	HocVienRespository hRespository;
	@Autowired
	KhoaHocRespository kRespository;

	@PutMapping(value = "/hocvien/sua")
	public void SuaHocVien(@RequestBody String hocVien) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		HocVien hvMoi = gson.fromJson(hocVien, HocVien.class);
		ValidatorFactory valFac = Validation.buildDefaultValidatorFactory();
		Validator val = valFac.getValidator();
		Set<ConstraintViolation<HocVien>> viola = val.validate(hvMoi);
		viola.forEach(x -> {
			System.out.println(x.getMessage());
		});
		if (viola.size() == 0) {
			HocVien hvCurrent = hRespository.findById(hvMoi.getId()).get();
			hvCurrent = hvMoi;
			hRespository.save(hvCurrent);
		}
	}

	@GetMapping(value = "/hocvien")
	public List<HocVien> Get() {
		return hRespository.findAll();
	}

	@GetMapping(value = "/hocvien/timkiem")
	public List<HocVien> TimKiem(@RequestParam String hoTen, int khoaHocID) {
		List<HocVien> lst = new ArrayList<HocVien>();
		for (HocVien x : hRespository.findAll()) {
			if (x.getHoTen().toLowerCase().contains(hoTen.toLowerCase()) && x.getKhoaHoc().getId() == khoaHocID) {
				lst.add(x);
			}

		}
		return lst;
	}
}
