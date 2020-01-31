package fr.webservice.club.service;

import java.util.List;

import javax.jws.WebParam;

import fr.webservice.club.entity.Booking;

public interface BookingService {

	List<Booking> getAll();
	
	List<Booking> getAllByIdClient(Integer idClient);
	
	List<Booking> getAllByParty(Integer id);
	
	Booking createBooking(Booking b);
	
	
}
