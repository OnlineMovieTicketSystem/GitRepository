package com.mtbs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Show")
public class Show {

	@Id
	@Column(name="show_id", length=10)
	private int id;
	@Column(name="show_name", length=20)
	private String name;
	@Column(name="show_start_time", length=20)
	private String startTime;
	@Column(name="show_end_time", length=20)
	private String endTime;
	@Column(name="available_seats", length=10)
	private int availableSeats;
	@Column(name="show_price", length=10)
	private int showPrice;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="screen_id",referencedColumnName="screen_id")
	private Screen screenId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="movie_id",referencedColumnName="movie_id")
	private Movie movieId;

	
	
	public Show() {
	}

	public Show(int id, String name, String startTime, String endTime, int availableSeats, int showPrice, Movie movieId,
			Screen screenId) {
		super();
		this.id = id;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.availableSeats = availableSeats;
		this.showPrice = showPrice;
		this.movieId = movieId;
		this.screenId = screenId;
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

	public  String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public  String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getShowPrice() {
		return showPrice;
	}

	public void setShowPrice(int showPrice) {
		this.showPrice = showPrice;
	}

	public Movie getMovieId() {
		return movieId;
	}

	public void setMovieId(Movie movieId) {
		this.movieId = movieId;
	}

	public Screen getScreenId() {
		return screenId;
	}

	public void setScreenId(Screen screenId) {
		this.screenId = screenId;
	}

	@Override
	public String toString() {
		return "Show [id=" + id + ", name=" + name + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", availableSeats=" + availableSeats + ", showPrice=" + showPrice + ", movieId=" + movieId
				+ ", screenId=" + screenId + "]";
	}

	
	}