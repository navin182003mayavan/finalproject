package com.example.collageDetails.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CollageDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String collagename;
	private String nirf_ranking;
	private String place;
	private String state;
	private int fees;
	private CollageDetails()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollagename() {
		return collagename;
	}
	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}
	public String getNirf_ranking() {
		return nirf_ranking;
	}
	public void setNirf_ranking(String nirf_ranking) {
		this.nirf_ranking = nirf_ranking;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	

}
