package com.mtbs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.mtbs.model.City;

public class CityRepostoryImpl implements CityRepository{
	@PersistenceContext
    EntityManager entityManager;
	
	@Override
	public City addCity(City city) {
		entityManager.persist(city);
		return city;
	}

	@Override
	public City viewCityById(int id) {
		return entityManager.find(City.class, id);
	}

	@Override
	public List<City> viewCities() {
		Query query = entityManager.createQuery("select c from City c", City.class);
        List<City> cities=query.getResultList();
		return cities;
	}

	@Override
	public void removeCity(int id) {
		City city= entityManager.find(City.class, id);
		entityManager.remove(city);	
	}

}
