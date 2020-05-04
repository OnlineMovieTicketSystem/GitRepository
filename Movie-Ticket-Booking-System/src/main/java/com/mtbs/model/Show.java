package com.mtbs.model;

public class Show {

	private int id;
	private String name;
	private int startTime;
	private int endTime;
	private int availableSeats;
	private Movie movieName;
	private Screen screenId;
	private Theatre theatreId;
	private int showPrice;

	public Show() {
	}

	public Show(int id, String name, int startTime, int endTime, int availableSeats, Movie movieName, Screen screenId,
			Theatre theatreId, int showPrice) {
		super();
		this.id = id;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.availableSeats = availableSeats;
		this.movieName = movieName;
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.showPrice=showPrice;
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

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Movie getMovieName() {
		return movieName;
	}

	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}

	public Screen getScreenId() {
		return screenId;
	}

	public void setScreenId(Screen screenId) {
		this.screenId = screenId;
	}

	public Theatre getTheatreId() {
		return theatreId;
	}

	public void setTheaterId(Theatre theatreId) {
		this.theatreId = theatreId;
	}
	
	public int getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(int showPrice) {
		this.showPrice = showPrice;
	}

	

	

}