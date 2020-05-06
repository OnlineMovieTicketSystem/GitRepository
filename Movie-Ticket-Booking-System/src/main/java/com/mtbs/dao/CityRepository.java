package com.mtbs.dao;

import java.util.List;
import com.mtbs.model.City;

public interface CityRepository {
	public City addCity(City city);
	public City viewCityById(int id);
	public List<City> viewCities();
	public void removeCity(int id);
}
