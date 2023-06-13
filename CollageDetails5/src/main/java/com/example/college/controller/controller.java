package com.example.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.model.model2;
import com.example.college.repository.repository2;

@RestController
public class controller {
	@Autowired
	repository2 repo2;
	@GetMapping("/getcombinedetails")
	public List<model2> gett(){
		return repo2.findAll();
	}
}
