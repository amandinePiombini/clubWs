package fr.webservice.club.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import fr.webservice.club.entity.Booking;

public interface BookingDao  extends CrudRepository<Booking, Integer> {

	List<Booking> findByClientId(Integer idClient);
	
	List<Booking> findByPartyId(Integer id);
	
}
