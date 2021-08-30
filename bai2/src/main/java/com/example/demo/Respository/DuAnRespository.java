package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.DuAn;

@Repository
public interface DuAnRespository extends JpaRepository<DuAn, Integer> {

}
