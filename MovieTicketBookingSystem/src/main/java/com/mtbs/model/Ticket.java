package com.mtbs.model;

import java.util.List;

public class Ticket {

	private int id;
	private int noOfSeats;
	private List<Seat> seatName;
	private Screen screen;

	public Ticket() {

	}

	public Ticket(int id, int noOfSeats, List<Seat> seatName, String screenName, Screen screen) {
		super();
		this.id = id;
		this.noOfSeats = noOfSeats;
		this.seatName = seatName;
		this.setScreen(screen);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<Seat> getSeatName() {
		return seatName;
	}

	public void setSeatName(List<Seat> seatName) {
		this.seatName = seatName;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", noOfSeats=" + noOfSeats + ", seatName=" + seatName + ", screen=" + screen + "]";
	}
	
}
