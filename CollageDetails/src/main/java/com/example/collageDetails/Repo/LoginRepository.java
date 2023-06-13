package com.example.collageDetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.collageDetails.Model.LoginModel;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Integer> {
	LoginModel findByUsername(String username);
	
		
	
}
