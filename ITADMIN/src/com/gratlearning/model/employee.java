package com.gratlearning.model;

public class employee {
	private String firstname;
	private String lastname;
	public employee() {
	this.firstname ="bhavana";
	this.lastname ="koneru";	
	}
	public employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
