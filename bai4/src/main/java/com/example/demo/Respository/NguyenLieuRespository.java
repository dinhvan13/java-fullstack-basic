package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.NguyenLieu;
@Repository
public interface NguyenLieuRespository extends JpaRepository<NguyenLieu, Integer>{

}
