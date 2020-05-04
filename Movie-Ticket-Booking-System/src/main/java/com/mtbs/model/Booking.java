package com.mtbs.model;

import java.time.LocalDate;
import java.util.List;

public class Booking {

	private int id;
	private Show show;
	private LocalDate bookingDate;
	private double totalCost;
	private List<Seat> seatList;
	private Customer customer;
	
	public Booking() {

	}

	public Booking(int id, Show show, LocalDate bookingDate, double totalCost, List<Seat> seatList, Customer customer) {
		super();
		this.id = id;
		this.show = show;
		this.bookingDate = bookingDate;
		this.totalCost = totalCost;
		this.seatList = seatList;
		this.customer=customer;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public List<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", show=" + show + ", bookingDate=" + bookingDate + ", totalCost=" + totalCost
				+ ", seatList=" + seatList + ", customer=" + customer + "]";
	}
	

}