package com.mtbs.model;

public class Seat {

	private int id;
	private BookingState seatStatus;
	private double price;

	public Seat() {
	}

	public Seat(int id, BookingState seatStatus, double price) {
		super();
		this.id = id;
		this.seatStatus = seatStatus;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", seatStatus=" + seatStatus + ", price=" + price + "]";
	}
	
}
