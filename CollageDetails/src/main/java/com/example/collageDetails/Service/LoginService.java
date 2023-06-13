package com.example.collageDetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collageDetails.Model.LoginModel;
import com.example.collageDetails.Repo.LoginRepository;
@Service
public class LoginService {
	@Autowired
    LoginRepository repository;
	
	public  String checkLogin(String username,String password){
		LoginModel user=repository.findByUsername(username);
		if (user==null) {
			return "No User Found";
			
		}
		else {
			if (user.getPassword().equals(password)) {
				return "Login Sucessful";
				
			}
			else {
				return "Login Failed";
			}
		}

	}
	public LoginModel addUser(LoginModel loginModel)
	{
		return repository.save(loginModel);
	}
	public List<LoginModel> getUser()
	{
		return repository.findAll();
	}
	public String deleteLogin(int id) {
		repository.deleteById(id);
		return id+ "deleted";
	}
	public  Optional<LoginModel> getUserbyId(int id) {
		return repository.findById(id);
	}
	

}
