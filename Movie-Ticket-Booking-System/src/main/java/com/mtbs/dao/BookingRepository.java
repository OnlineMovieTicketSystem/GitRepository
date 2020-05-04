package com.mtbs.dao;

import java.util.List;

import com.mtbs.model.Booking;
import com.mtbs.model.Seat;
import com.mtbs.model.Show;

public interface BookingRepository {
	
	
    
	public Booking addBooking(Booking book);
	public Booking viewBookingById(int id);
	public List<Booking> viewBookings();
	public void cancelBooking(int id);
	
}
