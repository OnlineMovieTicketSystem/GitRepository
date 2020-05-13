package com.mtbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtbs.model.City;
import com.mtbs.service.CityService;


@RestController
@RequestMapping(value="/city", method=RequestMethod.POST)
public class CityController {
	@Autowired
	CityService cityService;
	/**
	*addCity
	*description of method: gets a city class object and sends request to DAO layer
	*parameters: City city
	*returntype: City 
	*method Type: primitive
	*authorName: Shubham
	*version 1.0
	*/
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public City addCity(@RequestBody City city) {
		return cityService.addCity(city);
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
	@GetMapping(value="/view/{id}")
	public City viewCityById(@PathVariable("id") int id) {
		return cityService.viewCityById(id);
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
	@GetMapping(value="/viewCities")
	public List<City> viewCities() {
		return cityService.viewCities();
	}
	
	/**
	*removeCity
	*description of method: finds a city class object and deletes whole row present in table
	*parameters: int id
	*returntype: City  
	*method Type: deletion
	*authorName: Shubham
	*version 1.0
	*/
	@GetMapping(value="/removeCity/{id}")
	public void removeCity(@PathVariable("id") int id) {
		cityService.removeCity(id);
	}
}
