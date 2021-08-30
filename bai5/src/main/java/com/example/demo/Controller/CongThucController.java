package com.example.demo.Controller;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CongThuc;
import com.example.demo.Model.MonAn;
import com.example.demo.Respository.CongThucRespostiory;
import com.example.demo.Respository.LoaiMonAnRespository;
import com.example.demo.Respository.MonAnRespository;
import com.example.demo.Respository.NguyenLieuRespostiory;
import com.google.gson.Gson;

@RestController
public class CongThucController {
	@Autowired
	MonAnRespository maRespository;
	@Autowired
	LoaiMonAnRespository lmaRespository;
	@Autowired
	CongThucRespostiory ctRespostiory;
	@Autowired
	NguyenLieuRespostiory nlRespostiory;

	@PostMapping(value = "/congthuc/them")
	public void ThemCongThuc(@RequestBody String congThuc) {
		Gson gson = new Gson();
		CongThuc ctMoi = gson.fromJson(congThuc, CongThuc.class);
		ValidatorFactory valFac = Validation.buildDefaultValidatorFactory();
		Validator val = valFac.getValidator();
		Set<ConstraintViolation<CongThuc>> violation = val.validate(ctMoi);
		if (violation.size() == 0) {
			ctRespostiory.save(ctMoi);
			MonAn maCurrent = maRespository.findById(ctMoi.getMonAn().getId()).get();
			maCurrent.setCachLam(maCurrent.getCachLam() + "\n"
					+ nlRespostiory.findById(ctMoi.getNguyenLieu().getId()).get().getTenNguyenLieu() + " : "
					+ String.valueOf(ctMoi.getSoLuong()) + " " + ctMoi.getDonViTinh() + ", "

			);
			maRespository.save(maCurrent);

		}

	}
}
