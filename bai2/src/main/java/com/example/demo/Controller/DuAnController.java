package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.DuAn;
import com.example.demo.Respository.DuAnRespository;
import com.google.gson.Gson;

@RestController
public class DuAnController {
	@Autowired
	DuAnRespository dAnRespository;

	@GetMapping(value = "/duan")
	public List<DuAn> Get() {
		return dAnRespository.findAll();
	}

	@PutMapping(value = "/duan/sua", produces = MediaType.APPLICATION_JSON_VALUE)
	public void SuaDuAn(@RequestBody String duAn) {
		Gson gson = new Gson();
		DuAn duAnMoi = gson.fromJson(duAn, DuAn.class);
		DuAn duAnCurrent = dAnRespository.findById(duAnMoi.getId()).get();
		duAnCurrent.setTenDuAn(duAnMoi.getTenDuAn());
		duAnCurrent.setMoTa(duAnMoi.getMoTa());
		duAnCurrent.setGhiChu(duAnMoi.getGhiChu());
		duAnCurrent.setPhanCongs(duAnMoi.getPhanCongs());
		dAnRespository.save(duAnCurrent);
	}
}
