package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.LoaiNguyenLieu;

@Repository
public interface LoaiNguyenLieuRespository extends JpaRepository<LoaiNguyenLieu, Integer>{

}
