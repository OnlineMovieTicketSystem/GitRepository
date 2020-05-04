package com.mtbs.model;

import java.util.List;

public class City {

	private int id;
	private String name;
	private List<Theatre> theatres;
	

	public City() {
	}
	
	

	public City(int id, String name, List<Theatre> theatres) {
		super();
		this.id = id;
		this.name = name;
		this.theatres = theatres;
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


	public List<Theatre> getTheatres() {
		return theatres;
	}


	public void setTheatres(List<Theatre> theatres) {
		this.theatres = theatres;
	}



	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", theatres=" + theatres + "]";
	}
	

}