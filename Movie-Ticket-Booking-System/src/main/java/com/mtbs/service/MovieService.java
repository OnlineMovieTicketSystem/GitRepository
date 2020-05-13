package com.mtbs.service;

import java.util.List;

import com.mtbs.model.Movie;

public interface MovieService {
	
	public Movie addMovie(Movie movie);
	public void deleteMovie(int id);
	public Movie updateMovie(Movie movie,int id);
	public Movie getMovie(int id);
	public List<Movie> getAllMovies();

}

