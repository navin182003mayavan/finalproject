package com.example.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.college.model.model;

@Repository
public interface repository extends  JpaRepository<model, Integer>{

}
