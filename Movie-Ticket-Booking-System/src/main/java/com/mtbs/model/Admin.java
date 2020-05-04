package com.mtbs.model;

public class Admin {
	private int id;
	private String name;
	private String password;
	private long contact;

	public Admin() {
	}

	public Admin(int id, String name, String password, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", password=" + password + ", contact=" + contact + "]";
	}

	}