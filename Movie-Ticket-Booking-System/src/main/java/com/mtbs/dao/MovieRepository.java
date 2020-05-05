package com.mtbs.dao;

import java.util.List;

import com.mtbs.model.Movie;

public interface MovieRepository{
	
	public Movie addMovie(Movie movie);
	public boolean deleteMovie(int id);
	public Movie findById(int id);
	public List<Movie> findAll();
	public void updateMovie(Movie movie);
		
}

