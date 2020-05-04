package com.mtbs.model;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String name;
	private String password;
	private LocalDate dateOfBirth;
	private long contact;
	
	public Customer() {
	}
	
	public Customer(int id, String name, String password, LocalDate dateOfBirth,
			long contact) {
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", dateOfBirth=" + dateOfBirth
				+ ", contact=" + contact + "]";
	}

	
	

}