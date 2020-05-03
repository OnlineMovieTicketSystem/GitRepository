package com.mtbs.model;


import java.util.List;

public class Ticket {
	private int ticketId;
	private int noOfSeats;
	private List<Seat> seatName;
	private Theater theater;
	


 public Ticket() {
	 
 }

public Ticket(int ticketId, int noOfSeats, List<Seat> seatName, String screenName, Theater theater) {
	super();
	this.ticketId = ticketId;
	this.noOfSeats = noOfSeats;
	this.seatName = seatName;
	this.theater=theater;
}

public int getTicketId() {
	return ticketId;
}

public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
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


public Theater getTheater() {
	return theater;
}

public void setTheatre(Theater theater) {
	this.theater = theater;
}
}
 