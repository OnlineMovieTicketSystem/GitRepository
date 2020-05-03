package com.mtbs.model;

import java.util.List;

public class Theatre {

	private int id;
	private String name;
	private String city;
	private List<Movie> listOfMovies;
	private List<Screen> listOfScreens;
	private String managerName;
	private String managerContact;

	public Theatre() {
		
	}

	public Theatre(int id, String name, String city, List<Movie> listOfMovies, List<Screen> listOfScreens,
			String managerName, String managerContact) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.listOfMovies = listOfMovies;
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
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

	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", city=" + city + ", listOfMovies=" + listOfMovies
				+ ", listOfScreens=" + listOfScreens + ", managerName=" + managerName + ", managerContact="
				+ managerContact + "]";
	}

}