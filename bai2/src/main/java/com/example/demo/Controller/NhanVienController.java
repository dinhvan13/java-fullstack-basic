package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.NhanVien;
import com.example.demo.Model.PhanCong;
import com.example.demo.Respository.DuAnRespository;
import com.example.demo.Respository.NhanVienRespository;
import com.example.demo.Respository.PhanCongRespository;
import com.google.gson.Gson;

@RestController
public class NhanVienController {
	@Autowired
	NhanVienRespository nvRespository;
	@Autowired
	DuAnRespository duRespository;
	@Autowired
	PhanCongRespository pcRespository;

	@PostMapping(value = "/nhanvien/them")
	public void ThemNhanVien(@RequestBody String nhanVien) {
		Gson gson = new Gson();
		NhanVien nvMoi = gson.fromJson(nhanVien, NhanVien.class);
		nvRespository.save(nvMoi);

		nvMoi.getPhanCongs().forEach(x -> {
			x.setNhanVien(nvMoi);
		});
		pcRespository.saveAll(nvMoi.getPhanCongs());
	}

	@DeleteMapping(value = "/nhanvien/xoa")
	public void XoaNhanVien(@RequestParam int nhanvieniD) {
		nvRespository.deleteById(nhanvieniD);
	}

	public void TinhLuong() {
		List<PhanCong> lstpc = pcRespository.findAll();
		List<NhanVien> lstnv = nvRespository.findAll();
		lstnv.forEach(x -> {
			int tongGio = 0;
			for (int i = 0; i < lstpc.size(); i++) {
				if (x.getId() == lstpc.get(i).getNhanVien().getId()) {
					tongGio += lstpc.get(i).getSoGioLam();

				}
			}
			double luong = tongGio * 15 * x.getHeSoLuong();
			System.out.println(x.getHoTen() + " : " + luong);

		});
	}

	@GetMapping(value = "/nhanvien")
	public List<NhanVien> Get() {
		TinhLuong();
		return nvRespository.findAll();
	}

}
