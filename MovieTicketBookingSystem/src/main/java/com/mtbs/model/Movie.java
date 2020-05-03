package com.mtbs.model;

import java.util.Date;

public class Movie {
	
	private int id;
	private String name;
	private String director;
	private String language;
	private Date releaseDate;
	
	public Movie() {
	}
	
	public Movie(int id, String name, String director, String language, Date releaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.language = language;
		this.releaseDate = releaseDate;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", language=" + language
				+ ", releaseDate=" + releaseDate + "]";
	}
}