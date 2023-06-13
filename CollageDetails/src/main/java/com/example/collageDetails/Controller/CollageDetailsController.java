package com.example.collageDetails.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collageDetails.Model.CollageDetails;
import com.example.collageDetails.Repo.CollageDetailsRepo;
import com.example.collageDetails.Service.CollageDetailsService;



@RestController
@CrossOrigin("*")


public class CollageDetailsController {
	@Autowired
	private CollageDetailsService servicee;

	@GetMapping("/user/{id}")
	public Optional<CollageDetails> readbyId(@PathVariable int id) {
		return servicee.getCollageDetailsbtId(id);
	}
	@Autowired
	private CollageDetailsRepo Rep;
	@GetMapping("/showalldetails")
	  List<CollageDetails> read(){
		 return Rep.findAll(); 
	 }
	
	
	
	@PostMapping("/Addetails")
	public CollageDetails create(@RequestBody CollageDetails collageDetails) {
		return servicee.addCollageDetails(collageDetails);
	}
	
	@PutMapping("/update/{id}")
	public CollageDetails update(@PathVariable int id,@RequestBody CollageDetails CollageDetails) {
		return servicee.editCollageDetails(id, CollageDetails);
	}


	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		 servicee.deleteCollageDetails(id);
		 return "Deleted";
	}
	
	
	
	@GetMapping("/sortdes/{aCollageDetails}")
	public List<CollageDetails> sortCollageDetailss(@PathVariable("aCollageDetails") String acollageDetails)
	{
		return servicee.sortDesc(acollageDetails);
	}
	


}
