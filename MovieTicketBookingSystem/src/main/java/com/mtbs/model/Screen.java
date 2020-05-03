package com.mtbs.model;

import java.util.List;

import sun.util.calendar.BaseCalendar.Date;

public class Screen {
		
	private Integer id;
	private Theatre theatre;
	private String name;
	private List<Show> show;
	private Date movieEndDate;
	
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Screen(Integer id, Theatre theatre, String name, List<Show> show, Date movieEndDate) {
		super();
		this.id = id;
		this.theatre = theatre;
		this.name = name;
		this.show = show;
		this.movieEndDate = movieEndDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Show> getShow() {
		return show;
	}

	public void setShow(List<Show> show) {
		this.show = show;
	}

	public Date getMovieEndDate() {
		return movieEndDate;
	}

	public void setMovieEndDate(Date movieEndDate) {
		this.movieEndDate = movieEndDate;
	}

	@Override
	public String toString() {
		return "Screen [id=" + id + ", theatre=" + theatre + ", name=" + name + ", show=" + show + ", movieEndDate="
				+ movieEndDate + "]";
	}

	
}
