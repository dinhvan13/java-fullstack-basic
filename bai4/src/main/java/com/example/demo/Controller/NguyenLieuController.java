package com.example.demo.Controller;

import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoaiNguyenLieu;
import com.example.demo.Model.NguyenLieu;
import com.example.demo.Respository.ChiTietPhieuThuRespository;
import com.example.demo.Respository.LoaiNguyenLieuRespository;
import com.example.demo.Respository.NguyenLieuRespository;
import com.google.gson.Gson;

@RestController
public class NguyenLieuController {
	@Autowired
	LoaiNguyenLieuRespository lnlRespository;
	@Autowired
	ChiTietPhieuThuRespository ctptRespository;
	
	@Autowired
	NguyenLieuRespository nlRespository;
	
	@PostMapping(value = "/nguyenlieu/them")
	public void ThemNguyenLieu(@RequestBody String nguyenLieu) {
		Gson gson = new Gson();
		NguyenLieu nglMoi = gson.fromJson(nguyenLieu, NguyenLieu.class);
		
		ValidatorFactory valFac = Validation.buildDefaultValidatorFactory();
		Validator val = valFac.getValidator();
		Set<ConstraintViolation<NguyenLieu>> violation = val.validate(nglMoi);
		Optional<LoaiNguyenLieu> op = Optional.empty();
		if (violation.size() == 0 && lnlRespository.findById(nglMoi.getLoaiNguyenLieu().getId()) != op) {
	         nlRespository.save(nglMoi);
		}
		
	}
	
  

}
