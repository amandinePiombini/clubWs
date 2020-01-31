package fr.webservice.club;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.webservice.club.entity.Booking;
import fr.webservice.club.entity.Client;
import fr.webservice.club.entity.Club;
import fr.webservice.club.entity.Party;
import fr.webservice.club.service.BookingService;
import fr.webservice.club.service.ClientService;
import fr.webservice.club.service.ClubService;
import fr.webservice.club.service.PartyService;

@SpringBootTest
public class BookingTest {
	
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private PartyService partyService;
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ClubService clubService;
	
	@Test
	public void testCreateBooking() {
		Client client = clientService.getById(1);
		Party party = partyService.getById(1);
		Booking booking = new Booking(1,party,client,15);
		party.setCapacity(party.getCapacity()-15);
		Booking book = bookingService.createBooking(booking);
		if(party.getCapacity()>15) {
		assertEquals(client, booking.getClient());
		assertEquals(1, booking.getId());
		assertEquals(party, booking.getParty());
		assertEquals(15, booking.getNbCLient());
		}else {
			System.out.println("pas assez de place");
		}
	}
	
	
	@Test
	public void testGetBookingByClient() {
		Client client = clientService.getById(2);
		List<Booking> booking = bookingService.getAllByIdClient(client.getId());
		client.setBookings(booking);		
		assertEquals( client.getBookings(), booking);
		
	}

	
	
	@Test
	public void testGetAllPartyByClubTest() {
		Club club = clubService.getById(1);
		List<Party> parties = partyService.getAllPartyByClub(club.getId());
		club.setParties(parties);
		assertEquals(club.getParties(), parties);
	}
	
	@Test
	public void testCreateParty() {
		Club c = clubService.getById(1);
		List<Booking>bookings = bookingService.getAllByParty(2);
		Party p = new Party(2,"nom","theme","description",150, c, bookings);
		Party party = partyService.createParty(p);
		assertEquals(2, p.getId());
		assertEquals("nom", p.getName());
		assertEquals("theme", p.getTheme());
		assertEquals("description", p.getDescription());
		assertEquals(150, p.getCapacity());
		assertEquals(c, p.getClub());
		assertEquals(bookings, p.getBookings());
		
	}
}
