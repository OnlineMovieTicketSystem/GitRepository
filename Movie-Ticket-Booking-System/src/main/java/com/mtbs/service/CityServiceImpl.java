package com.mtbs.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbs.dao.CityRepository;
import com.mtbs.model.City;

@Transactional
@Service
public class CityServiceImpl implements CityService{
	@Autowired
	private CityRepository cityRepo;
	
	
	/**
	*addCity
	*description of method: gets a city class object and sends request to DAO layer
	*parameters: City city
	*returntype: City 
	*method Type: primitive
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public City addCity(City city) {
		return cityRepo.addCity(city);
	}
	
	
	/**
	*viewCity
	*description of method: finds a city class object and provide other details
	*parameters: int id
	*returntype: City  
	*method Type: searching
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public City viewCityById(int id) {
		return cityRepo.viewCityById(id);
	}
	/**
	*viewCityById
	*description of method: finds a city class object and provide other details
	*parameters: int id
	*returntype: City  
	*method Type: searching
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public List<City> viewCities() {
		return cityRepo.viewCities();
	}

	
	/**
	*removeCity
	*description of method: finds a city class object and deletes whole row present in table
	*parameters: int id
	*returntype: City  
	*method Type: searching and deletion
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public void removeCity(int id) {
		cityRepo.removeCity(id);
	}

}
