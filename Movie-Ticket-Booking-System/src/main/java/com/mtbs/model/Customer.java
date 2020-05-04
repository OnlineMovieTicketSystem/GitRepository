package com.mtbs.model;

import java.time.LocalDate;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String password;
	private LocalDate dateOfBirth;
	private String contact;
	
	public Customer() {
	}
	
	public Customer(int id, String name, String password, LocalDate dateOfBirth,
			String contact) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", dateOfBirth=" + dateOfBirth
				+ ", contact=" + contact + "]";
	}

	
	

}