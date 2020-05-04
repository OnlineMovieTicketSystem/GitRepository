package com.mtbs.model;

public class Admin {
	private String id;
	private String name;
	private String password;
	private String contact;

	public Admin() {
	}

	public Admin(String id, String name, String password, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", contact=" + contact + "]";
	}

	}