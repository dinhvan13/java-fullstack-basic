package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.NhanVien;

@Repository
public interface NhanVienRespository extends JpaRepository<NhanVien, Integer> {

}
