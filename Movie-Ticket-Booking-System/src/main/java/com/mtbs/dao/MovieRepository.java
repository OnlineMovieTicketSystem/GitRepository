package com.mtbs.dao;

import org.springframework.data.repository.CrudRepository;

import com.mtbs.model.Movie;

public interface MovieRepository extends CrudRepository<Movie,Integer>{
	
	public Movie getMovieById(int id);

}


