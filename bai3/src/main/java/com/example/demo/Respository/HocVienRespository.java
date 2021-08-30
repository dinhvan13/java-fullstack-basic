package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.HocVien;

@Repository
public interface HocVienRespository extends JpaRepository<HocVien, Integer>{

}
