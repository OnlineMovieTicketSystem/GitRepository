package com.mtbs.model;

public class User {
	
	private int userId;
	private String userName;
	private String password;
	
	public User(int userId, String userName, String password) {
		this.userId=userId;
		this.userName=userName;
		this.password=password;
	}
	public int getUserId() {
		return this.userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setUserId(int id) {
		this.userId=id;
	}
	
	public void setUserName(String name) {
		this.userName=name;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
}