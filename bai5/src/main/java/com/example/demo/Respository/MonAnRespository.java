package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.MonAn;
@Repository
public interface MonAnRespository extends JpaRepository<MonAn, Integer>{

}
