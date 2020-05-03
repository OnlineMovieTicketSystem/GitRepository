package com.mtbs.model;

import java.util.List;

public class City {
	
	private int cityId;
	private String cityName;
	private List<Theatre> listOfTheatre;
	
	public City(int cityId, String cityName, List<Theatre> listOfTheatre) {
		this.cityId=cityId;
		this.cityName=cityName;
		this.listOfTheatre=listOfTheatre;
	}
	
	public int getCityId() {
		return this.cityId;
	}
	
	public String getCityName() {
		return this.cityName;
	}
	
	public List<Theatre> getListOfTheatre() {
		return this.listOfTheatre;
	}
	
	public void setCityId(int id) {
		this.cityId=id;
	}
	
	public void setCityName(String name) {
		this.cityName=name;
	}
	
	public void setListOfTheatre(List<Theatre> theatreList) {
		this.listOfTheatre=theatreList;
	}
}