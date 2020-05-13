package com.mtbs.service;

import java.util.List;

import com.mtbs.model.City;

public interface CityService {
	public City addCity(City city);
	public City viewCityById(int id);
	public List<City> viewCities();
	public void removeCity(int id);
}
