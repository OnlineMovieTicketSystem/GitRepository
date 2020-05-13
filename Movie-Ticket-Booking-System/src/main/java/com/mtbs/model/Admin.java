package com.mtbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="admin")
public class Admin {
	@Id
	private int id;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String password;
	@Column(length=20)
	private long contact;

	public Admin() {
		
	}
	/**
	*Admin()
	*description of method: creates admin object
	*parameters: int id, long contact, String name, String password
	*returntype: Admin  
	*method Type: contructor
	*authorName: Shubham
	*version 1.0
	*/
	public Admin(int id, long contact, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.contact = contact;
	}

	
	/**
	*getId()
	*description of method: gets admin id
	*parameters: void
	*returntype: int  
	*method Type: getter
	*authorName: Shubham
	*version 1.0
	*/
	public int getId() {
		return id;
	}

	
	/**
	*setId()
	*description of method: sets admin id
	*parameters: int id
	*returntype: void 
	*method Type: setter
	*authorName: Shubham
	*version 1.0
	*/
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", contact=" + contact + ", name=" + name + ", password=" + password + "]";
	}

	}
