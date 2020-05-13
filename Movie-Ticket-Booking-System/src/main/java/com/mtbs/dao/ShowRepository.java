package com.mtbs.dao;

import org.springframework.data.repository.CrudRepository;

import com.mtbs.model.Show;

public interface ShowRepository extends CrudRepository<Show,Integer>{
	
	public Show getShowById(int id);
	
	
	
}

