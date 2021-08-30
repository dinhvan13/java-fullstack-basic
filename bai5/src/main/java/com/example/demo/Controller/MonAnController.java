package com.example.demo.Controller;

import java.util.HashSet;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.CongThuc;
import com.example.demo.Model.LoaiMonAn;
import com.example.demo.Model.MonAn;
import com.example.demo.Respository.CongThucRespostiory;
import com.example.demo.Respository.LoaiMonAnRespository;
import com.example.demo.Respository.MonAnRespository;
import com.example.demo.Respository.NguyenLieuRespostiory;
import com.google.gson.Gson;

@RestController
public class MonAnController {
	@Autowired
	MonAnRespository maRespository;
	@Autowired
	LoaiMonAnRespository lmaRespository;
	@Autowired
	CongThucRespostiory ctRespostiory;
	@Autowired
	NguyenLieuRespostiory nlRespostiory;

	@PostMapping(value = "/monan/them")
	public void ThemMonAn(@RequestBody String monAn) {
		Gson gson = new Gson();
		MonAn maMoi = gson.fromJson(monAn, MonAn.class);

		ValidatorFactory valFac = Validation.buildDefaultValidatorFactory();
		Validator val = valFac.getValidator();
		Set<ConstraintViolation<MonAn>> violation = val.validate(maMoi);
		Optional<LoaiMonAn> op = Optional.empty();
		if (violation.size() == 0 && lmaRespository.findById(maMoi.getLoaiMonAn().getId()) != op) {

			maRespository.save(maMoi);
		}
	}

	@GetMapping(value = "/monan/timkiem")
	public Set<MonAn> TimKiem(@RequestParam String tenMon, @RequestParam String tenNguyenLieu) {
		Set<MonAn> set = new HashSet<MonAn>();
		maRespository.findAll().forEach(x -> {
			if (x.getTenMon().toLowerCase().contains(tenMon.toLowerCase())) {
				if (x.getCachLam().toLowerCase().contains(tenNguyenLieu.toLowerCase())) {
					set.add(x);
				}
				x.getCongThucs().forEach(y -> {
					if (y.getNguyenLieu().getTenNguyenLieu().toLowerCase().contains(tenNguyenLieu.toLowerCase())) {
						set.add(x);
					}

				});
			}

		});
		return set;
	}

}
