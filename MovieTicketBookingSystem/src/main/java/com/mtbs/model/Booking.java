package com.mtbs.model;

import java.time.LocalDate;
import java.util.List;

public class Booking {

	private int id;
	private Show show;
	private LocalDate bookingDate;
	private double totalCost;
	private List<Seat> seatList;
	private Ticket ticket;

	public Booking() {

	}

	public Booking(int id, Show show, LocalDate bookingDate, double totalCost, List<Seat> seatList,
			Ticket ticket) {
		super();
		this.id = id;
		this.show = show;
		this.bookingDate = bookingDate;
		this.totalCost = totalCost;
		this.seatList = seatList;
		this.ticket = ticket;
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

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", show=" + show + ", bookingDate=" + bookingDate + ", totalCost=" + totalCost
				+ ", seatList=" + seatList + ", ticket=" + ticket + "]";
	}
	

}