package com.example.demo.bai1.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bai1.Model.Lop;
@Repository
public interface LopRespository extends JpaRepository<Lop, Integer> {

}
