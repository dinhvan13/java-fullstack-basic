package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.KhoaHoc;

@Repository
public interface KhoaHocRespository extends JpaRepository<KhoaHoc, Integer>{

}
