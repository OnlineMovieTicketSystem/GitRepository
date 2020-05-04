package com.mtbs.model;

public class Seat {

	private int id;
	private String seatNumber;
	private BookingState seatStatus;
	

	public Seat() {
	}

	public Seat(int id, BookingState seatStatus, String seatNumber) {
		super();
		this.id = id;
		this.seatNumber=seatNumber;
		this.seatStatus = seatStatus;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int seatId) {
		this.id = seatId;
	}

	public BookingState getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(BookingState seatStatus) {
		this.seatStatus = seatStatus;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
}
