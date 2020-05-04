package com.mtbs.model;

import java.util.Date;
import java.util.List;

public class Screen {

	private int id;
	private String name;
	private Theatre theatreId;
	private List<Show> show;
	private Date movieEndDate;

	public Screen() {
	}

	public Screen(int id, String name, Theatre theatre,List<Show> show, Date movieEndDate) {
		super();
		this.id = id;
		this.name = name;
		this.theatreId = theatre;
		this.show = show;
		this.movieEndDate = movieEndDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Theatre getTheatre() {
		return theatreId;
	}

	public void setTheatre(Theatre theatre) {
		this.theatreId = theatre;
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
		return "Screen [id=" + id + ", name=" + name + ", theatre=" + theatreId + ", show=" + show + ", movieEndDate="
				+ movieEndDate + "]";
	}

}