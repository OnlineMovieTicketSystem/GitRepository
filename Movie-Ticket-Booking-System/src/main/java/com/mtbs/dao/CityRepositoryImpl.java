package com.mtbs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mtbs.model.City;
@Repository
public class CityRepositoryImpl implements CityRepository{
	@PersistenceContext
    EntityManager entityManager;
	
	
	/**
	*addCity
	*description of method:gets a city class object and inserts data into sql table
	*parameters: City city
	*returntype: City 
	*method Type: insertion
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public City addCity(City city) {
		entityManager.persist(city);
		return city;
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
	public City viewCityById(int id) {
		return entityManager.find(City.class, id);
	}
	
	
	/**
	*viewCities
	*description of method: finds list of all cities
	*parameters: void
	*returntype: List<City>  
	*method Type: getter
	*authorName: Shubham
	*version 1.0
	*/
	@Override
	public List<City> viewCities() {
		Query query = entityManager.createQuery("select c from City c", City.class);
        List<City> cities=query.getResultList();
		return cities;
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
		City city= entityManager.find(City.class, id);
		entityManager.remove(city);	
	}

}
