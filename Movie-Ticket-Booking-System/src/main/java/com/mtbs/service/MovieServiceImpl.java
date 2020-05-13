package com.mtbs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mtbs.dao.MovieRepository;
import com.mtbs.exception.MovieException;
import com.mtbs.model.Movie;

@Transactional
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	/**
	 * method name: addMovie 
	 * method desc: gets a movie class object and insert into database through save method 
	 * parameters: Movie type - movie 
	 * return type: Movie 
	 * method type: insertion 
	 * author name: Shivani
	 */
	@Override
	public Movie addMovie(Movie movie) {
		Movie newMovie = movieRepository.save(movie);
		return newMovie;
	}

	/**
	 * method name: deleteMovie 
	 * method desc: get the id of movie and delete it from database through delete by id method. 
	 * parameters: int type - id 
	 * return type: void 
	 * method type: deletion 
	 * author name: Shivani
	 */
	@Override
	public void deleteMovie(int id) {
		movieRepository.deleteById(id);
	}

	/**
	 * method name: updateMovie 
	 * method desc: gets a movie class object and update this movie object into database through save method 
	 * parameters: Movie 
	 * type - movie 
	 * return type: Movie method 
	 * type: updation 
	 * author name: Shivani
	 */
	@Override
	public Movie updateMovie(Movie movie, int id) {
		Movie m = movieRepository.getMovieById(id);
		if (m != null) {
			movie.setId(id);
			movieRepository.save(movie);
		}
		return movie;
	}

	/**
	 * method name: getMovie 
	 * method desc: gets a id of movie and fetch from database
	 * through get by id method 
	 * parameters: int type - id 
	 * return type: Movie 
	 * method type: retrieve 
	 * author name: Shivani
	 */	
	@Override
	public Movie getMovie(int id) {
		Movie movie = movieRepository.getMovieById(id);
		if (movie != null) {
			return movie;
		}
		throw new MovieException("Movie with id " + id + " does not exists");
	}

	/**
	 * method name: getAllMovies 
	 * method desc: fetch the list of all the movies
	 * present in the database 
	 * parameters: no parameters 
	 * return type: List of Movie type 
	 * method type: retrieve 
	 * author name: Shivani
	 */
	@Override
	public List<Movie> getAllMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		movieRepository.findAll().forEach(m -> movies.add(m));
		return movies;
	}

}
