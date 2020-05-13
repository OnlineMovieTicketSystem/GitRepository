package com.mtbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mtbs.model.Movie;
import com.mtbs.service.MovieService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	
	/**
	 * method name: addMovie
	 * method desc: add a movie class object by calling the method of service class.
	 * parameters: Movie type - movie
	 * return type: Movie
	 * method type: post
	 * author name: Shivani
	 */
	@RequestMapping(value="/movies",method=RequestMethod.POST)//movies everywhere
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}
	
	/**
	 * method name: getMovie
	 * method desc: to fetch the details of movie through movie id by calling the method of service class.
	 * parameters: int type - id
	 * return type: Movie
	 * method type: get
	 * author name: Shivani
	 */
	@GetMapping(value="/movies/{id}")
	public Movie getMovie(@PathVariable("id") int id){
		Movie movie=movieService.getMovie(id);
		return movie;
	}
	
	/**
	 * method name: getAllMovies
	 * method desc: calls the method of service class and fetch all the movies.
	 * parameters: no parameters
	 * return type: List of Movie Type
	 * method type: get
	 * author name: Shivani
	 */
	@GetMapping(value="/movies")
	public List<Movie> listOfMovies(){
		return movieService.getAllMovies();		
	}
	
	
	/**
	 * method name: deleteMovie
	 * method desc: to delete the movie through movie id by calling the method of service class.
	 * parameters: int type - id
	 * return type: boolean
	 * method type: delete
	 * author name: Shivani
	 */
	@DeleteMapping(value="/movies/{id}")
	public boolean deleteMovie(@PathVariable("id") int id) {
		movieService.deleteMovie(id);
		return true;
	}
	
	/**
	 * method name:updateMovie
	 * method desc: to update the movie object by calling the method of service class.
	 * parameters: Movie type- movie
	 * return type: Movie
	 * method type: put
	 * author name: Shivani
	 */
	@PutMapping(value="/movies/{id}")
	public Movie updateMovie(@RequestBody Movie movie,@PathVariable int id) {
		Movie updatedMovie=movieService.updateMovie(movie,id);
		return updatedMovie;
	}

}
