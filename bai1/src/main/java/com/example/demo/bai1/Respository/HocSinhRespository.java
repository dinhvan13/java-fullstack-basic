package com.example.demo.bai1.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bai1.Model.HocSinh;

@Repository
public interface HocSinhRespository extends JpaRepository<HocSinh, Integer> {

}
