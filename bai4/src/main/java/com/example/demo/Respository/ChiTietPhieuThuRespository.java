package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.ChiTietPhieuThu;
@Repository
public interface ChiTietPhieuThuRespository extends JpaRepository<ChiTietPhieuThu, Integer> {

}
