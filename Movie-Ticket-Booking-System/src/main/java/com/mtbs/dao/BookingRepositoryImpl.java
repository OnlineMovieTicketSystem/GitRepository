package com.mtbs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.mtbs.model.Booking;
@Repository
public class BookingRepositoryImpl implements BookingRepository{
	
	@PersistenceContext
    EntityManager em;

	@Override
	public Booking addBooking(Booking booking) {
		em.persist(booking);
		return booking;
	}

	@Override
	public Booking viewBookingById(int id) {
		return em.find(Booking.class, id);
		
	}

	@Override
	public List<Booking> viewBookings() {
		Query query = em.createQuery("select b from Booking b", Booking.class);
        List<Booking> bookings=query.getResultList();
		return bookings;
	}

	@Override
	public void cancelBooking(int id) {
		Booking booking= em.find(Booking.class, id);
			em.remove(booking);	
	}

}
