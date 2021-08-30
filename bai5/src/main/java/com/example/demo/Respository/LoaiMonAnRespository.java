package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.LoaiMonAn;
@Repository
public interface LoaiMonAnRespository extends JpaRepository<LoaiMonAn, Integer> {

}
