package com.example.college.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class model {
@Id
@GeneratedValue
 private int id;
 private String collagename;
 private String nirf_ranking;
 private String place;
 private String state;
 private String fees;
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
public String getFees() {
	return fees;
}
public void setFees(String fees) {
	this.fees = fees;
}
public model(int id, String collagename, String nirf_ranking, String place, String state, String fees) {
	super();
	this.id = id;
	this.collagename = collagename;
	this.nirf_ranking = nirf_ranking;
	this.place = place;
	this.state = state;
	this.fees = fees;
}
@Override
public String toString() {
	return "model [id=" + id + ", collagename=" + collagename + ", nirf_ranking=" + nirf_ranking + ", place=" + place
			+ ", state=" + state + ", fees=" + fees + "]";
}
public model() {
	super();
}
 
}

