package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Respository.CongThucRespostiory;
import com.example.demo.Respository.LoaiMonAnRespository;
import com.example.demo.Respository.MonAnRespository;
import com.example.demo.Respository.NguyenLieuRespostiory;

@RestController
public class LoaiMonAnController {
	@Autowired
	MonAnRespository maRespository;
	@Autowired
	LoaiMonAnRespository lmaRespository;
	@Autowired
	CongThucRespostiory ctRespostiory;
	@Autowired
	NguyenLieuRespostiory nlRespostiory;

	@DeleteMapping(value = "/loaimonan/xoa")
	public void XoaLoaiMonAn(@RequestParam int loaiMonAnID) {
		try {
			maRespository.findAll().forEach(x -> {
				if (x.getLoaiMonAn().getId() == loaiMonAnID) {
					ctRespostiory.findAll().forEach(y -> {
						if (y.getMonAn() == x) {
							ctRespostiory.delete(y);
						}
					});
					maRespository.delete(x);

				}
			});

			lmaRespository.deleteById(loaiMonAnID);
		} catch (Exception e) {
			System.out.println("khong the xoa duoc!");
		}

	}
}
