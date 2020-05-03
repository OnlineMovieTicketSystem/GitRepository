package com.capg.movieticketbookingsystem.model;

import java.util.Date;
import java.util.List;

public class Movie {
	
	private int MovieId;
	private String movieName;
	private String movieDirector;
	private List<String> languages;
	private Date movieReleaseDate;
	//private String movieGenre;
	//private int movieLength;
	

	public Movie() {
	}
	
	public Movie(int movieId, String movieName, String movieDirector, List<String> languages, Date movieReleaseDate) {
		super();
		MovieId = movieId;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.languages = languages;
		this.movieReleaseDate = movieReleaseDate;
	}
	public int getMovieId() {
		return MovieId;
	}
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public Date getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(Date movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	

}
