package com.example.collageDetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.collageDetails.Model.CollageDetails;
import com.example.collageDetails.Repo.CollageDetailsRepo;

@Service
public class CollageDetailsService {
	@Autowired
	private CollageDetailsRepo repos;
	
	public List<CollageDetails> getCollageDetails() {
		return repos.findAll();
	}
	public Optional<CollageDetails> getCollageDetailsbtId(int id) {
		return repos.findById(id);
	}
	public CollageDetails addCollageDetails (CollageDetails collageDetails) {
		return repos.save(collageDetails);
	}
	public CollageDetails editCollageDetails(int id,CollageDetails collageDetails) {
		CollageDetails collageDetailsy = repos.findById(id).orElse(null);
		if(collageDetailsy != null) {
			collageDetailsy.setCollagename(collageDetails.getCollagename());
			collageDetailsy.setNirf_ranking(collageDetails.getNirf_ranking());
			collageDetailsy.setPlace(collageDetails.getPlace());
			collageDetailsy.setState(collageDetails.getState());
			collageDetailsy.setFees(collageDetails.getFees());
			
			
			return repos.saveAndFlush(collageDetailsy);
			
		}
		else {
			return null;
		}
 	}

	public String deleteCollageDetails(int id) {
		repos.deleteById(id);
		return id+ " deleted ! " ;
	}
	
	//sorting
	public List<CollageDetails> sortDesc(String aCollageDetails)
	{
		return repos.findAll(Sort.by(aCollageDetails).ascending());
	}
	
	//Pagination
	public List<CollageDetails> paginationData(int pageNu, int pageSize)
	{
		Page<CollageDetails> a=repos.findAll(PageRequest.of(pageNu, pageSize));
		return a.getContent();
	}
	//Pagination & Sorting
	public List<CollageDetails> paginationDataSort(int pageNu, int pageSize,String col)
	{
		Page<CollageDetails> a=repos.findAll(PageRequest.of(pageNu, pageSize,Sort.by(col).ascending()));
		return a.getContent();
	}
}


