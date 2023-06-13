package com.example.college.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class model2 {
@Id
private int id;
private String principal;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn
private List<model> details;


public List<model> getDetails() {
	return details;
}
public void setDetails(List<model> details) {
	this.details = details;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPrincipal() {
	return principal;
}
public void setPrincipal(String principal) {
	this.principal = principal;
}
public String getHOD() {
	return HOD;
}
public void setHOD(String hOD) {
	HOD = hOD;
}
public String getDeen() {
	return Deen;
}
public void setDeen(String deen) {
	Deen = deen;
}
private String HOD;
private String Deen;


}
