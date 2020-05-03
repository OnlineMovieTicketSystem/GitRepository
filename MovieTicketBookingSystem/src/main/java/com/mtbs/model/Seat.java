package com.mtbs.model;


public class Seat {

	private int seatId;
	private BookingState seatStatus;
	private double seatPrice;
	
	public Seat() {
	}

	public Seat(int seatId, BookingState seatStatus, double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatStatus = seatStatus;
		this.seatPrice = seatPrice;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}

	public BookingState getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(BookingState seatStatus) {
		this.seatStatus = seatStatus;
	}

	public double getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
}
