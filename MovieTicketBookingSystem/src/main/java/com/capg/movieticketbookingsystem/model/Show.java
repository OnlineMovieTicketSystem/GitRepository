package com.capg.movieticketbookingsystem.model;

import java.util.List;

public class Show {
	
	
	private int showId;
	private int showStartTime;
	private int showEndTime;
	private List<Seat> seats;
	private String showName;
	private Movie movieName;
	private int screenId;
	private int theaterId;
	

	public Show() {
	}

	public Show(int showId, int showStartTime, int showEndTime, List<Seat> seats, String showName, Movie movieName,
			int screenId, int theaterId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seats = seats;
		this.showName = showName;
		this.movieName = movieName;
		this.screenId = screenId;
		this.theaterId = theaterId;
	}
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public int getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(int showStartTime) {
		this.showStartTime = showStartTime;
	}
	public int getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(int showEndTime) {
		this.showEndTime = showEndTime;
	}
	public List<Seat> getSeats() {
		return seats;
	}
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Movie getMovieName() {
		return movieName;
	}
	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	
	

}
