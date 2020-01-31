package fr.webservice.club.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.webservice.club.dao.BookingDao;
import fr.webservice.club.entity.Booking;

@Service
@Transactional
@WebService(endpointInterface = "fr.webservice.club.service.BookingService")
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private BookingDao bookingDao;

	@Override
	public List<Booking> getAll() {
		// TODO Auto-generated method stub
		return  (List<Booking>) bookingDao.findAll();
		
	}

	@Override
	public List<Booking> getAllByIdClient(Integer idClient) {
		// TODO Auto-generated method stub
		return bookingDao.findByClientId(idClient);
	}

	@Override
	public List<Booking> getAllByParty(Integer id) {
		// TODO Auto-generated method stub
		return bookingDao.findByPartyId(id);
	}

	@Override
	public Booking createBooking(Booking b) {
		// TODO Auto-generated method stub
		return bookingDao.save(b);
	}

}
