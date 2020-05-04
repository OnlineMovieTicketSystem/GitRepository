package com.mtbs.model;

import java.util.List;

public class City {

	private int id;
	private String name;
	private List<Theatre> listOfTheatre;
	

	public City() {
	}

	public City(int id, String name, List<Theatre> listOfTheatre) {
		this.id = id;
		this.name = name;
		this.listOfTheatre = listOfTheatre;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public List<Theatre> getListOfTheatre() {
		return this.listOfTheatre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setListOfTheatre(List<Theatre> theatreList) {
		this.listOfTheatre = theatreList;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", listOfTheatre=" + listOfTheatre + "]";
	}
	
}