package com.mtbs.model;

import java.util.List;

public class Theatre {

	private int id;
	private String name;
	private String city;
	private List<Screen> listOfScreens;
	

	public Theatre() {

	}

	public Theatre(int id, String name, String city, List<Screen> listOfScreens) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.listOfScreens = listOfScreens;
	
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", city=" + city + ", listOfScreens=" + listOfScreens + "]";
	}

	

	

}