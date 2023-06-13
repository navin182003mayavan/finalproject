package com.example.collageDetails.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.collageDetails.Model.LoginModel;
import com.example.collageDetails.Service.LoginService;

@RestController
@CrossOrigin("*")
public class LoginController {
@Autowired
  private LoginService service;
	
@PostMapping("/login")
public String login(@RequestBody Map<String, String> loginData) {
	String username=loginData.get("username");
	String password=loginData.get("password");
	String result=service.checkLogin(username, password);
	return result;
}
@PostMapping("/adduser")
public LoginModel AddUser(@RequestBody LoginModel loginModel) {
return service.addUser(loginModel);	
}
}
