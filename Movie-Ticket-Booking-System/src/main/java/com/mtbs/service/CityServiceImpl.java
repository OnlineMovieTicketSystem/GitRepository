package com.mtbs.service;

import java.util.List;

import com.mtbs.dao.CityRepository;
import com.mtbs.model.City;

public class CityServiceImpl implements CityService{
	private CityRepository cityRepo;
	@Override
	public City addCity(City city) {
		return cityRepo.addCity(city);
	}

	@Override
	public City viewCityById(int id) {
		return cityRepo.viewCityById(id);
	}

	@Override
	public List<City> viewCities() {
		return cityRepo.viewCities();
	}

	@Override
	public void removeCity(int id) {
		cityRepo.removeCity(id);
	}

}
