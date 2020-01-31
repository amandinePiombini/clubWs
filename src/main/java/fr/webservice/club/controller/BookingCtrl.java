package fr.webservice.club.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.webservice.club.entity.Booking;
import fr.webservice.club.entity.Client;
import fr.webservice.club.entity.Party;
import fr.webservice.club.service.BookingService;
import fr.webservice.club.service.ClientService;
import fr.webservice.club.service.PartyService;

@RestController
@RequestMapping(value="/booking-api/public/booking"/*, headers="Accept=application/json"*/)
//@Api(tags = { "My REST Devise api (public part)" })
@CrossOrigin("*")
public class BookingCtrl {

	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private PartyService partyService;
	
	
	
	
	@GetMapping(value="/liste")
	public List<Booking> getAllBookings() {
	
		return bookingService.getAll();
	}
	
	@GetMapping(value="/liste/{id}")
	public Client getClientbyId(@PathVariable("id")Integer id) {
	
		return clientService.getById(id);
	}
	
	@GetMapping(value="/client/{idClient}")
	public List<Booking> getAllBookingsClient(@PathVariable("idClient")Integer idClient) {
	
			return bookingService.getAllByIdClient(idClient);			
	}
	
	@GetMapping(value="/party/{id}")
	public List<Booking> getAllBookingsForParty(@PathVariable("id")Integer idParty) {
	
			return bookingService.getAllByParty(idParty);			
	}
	
	
	
	
	
	
	@PostMapping(value="/createBooking",consumes = "application/json", produces = "application/json")
	public Booking createBooking(@Valid @RequestBody Booking booking) {
//		
//		Integer idc = 2;
//		Integer idp = 4;
//		Integer nb = 3;
//		Client c = clientService.getById(idc);
//		Party p = partyService.getById(idp);
//		booking.setClient(c);
//		booking.setParty(p);
//		
//		int dispo = p.getCapacity();
//		if(nb<dispo) {
//		booking.setNbCLient(nb);
//		p.setCapacity(dispo-nb);
//		} else {
//			System.out.println("pas assez de place");
//		}
			System.out.println(booking);
		return bookingService.createBooking(booking);
		
		
	}
//	
//	@RequestMapping(value="/newBooking", method = RequestMethod.POST)
//	public Booking createBooking(@RequestParam("txtClient") Integer client, @RequestParam("txtNb") Integer nbClient, @RequestParam("txtParty") Integer party) {
//		//@RequestParam("txtClient") Client client, @RequestParam("txtNb") Integer nbClient, @RequestParam("txtParty") Party party
//		Booking b = new Booking();
//
//		Client c = clientService.getById(client);
//		Party p = partyService.getById(party);
//		System.out.println(c);
//		System.out.println(p);
//		b.setClient(c);
//		b.setParty(p);
//		b.setNbCLient(nbClient);
//		System.out.println(b);
//		return bookingService.createBooking(b);
//	}
		

/***********************************************************************/
	
//	@RequestMapping(value="/devisews" , method=RequestMethod.POST)
//	public Devise postDevise(@RequestParam("txtCode")String code,
//							@RequestParam("txtName")String name,
//							@RequestParam("txtChange")Double change) {
//		Devise d = new Devise();
//		d.setCode(code);
//		d.setName(name);
//		d.setChange(change);
//		deviseService.sauvegarderDevise(d);
//		return deviseService.sauvegarderDevise(d);
//	}
//	
/***********************************************************************/
	
	
	
	
	
	
	
	
	


	private Iterable<Booking> bookings;
	
	public void init() {
		this.bookings= bookingService.getAll();
		
		System.out.println("plop");
	}

	/******************************************************************************************************************************/
	
	
//	@GetMapping(value="/{codeDevise}")
//	public List<Booking> getDeviseByCode(@PathVariable("codeDevise")  Integer id){
//		return bookingService.getAllByClient(id);
//	}
	//url complete : http://localhost:8080/springBootWs/devise-api/public/devise
	//http://localhost:8080/springBootWs/devise-api/public/devise?changeMini=0.95
//	@GetMapping(value="")
//	public List<Booking> getDevisesByCriteria(
//			@RequestParam(value="id",required=false) Integer id){
//		if(id!=null)
//			return bookingService.getAllByClient(id);
//		else
//			return bookingService.getAll();
//	}	
	
	
	
	
	
	
	
	
	/*
	// Version techniquement correcte (au sens HTTP) MAIS SANS IDEMPOTENCE 
	//en mode DELETE, url=http://localhost:8080/springBootWs/devise-api/public/devise/JPY
	@DeleteMapping(value="/{codeDevise}")
	public void deleteDeviseByCode(@PathVariable("codeDevise")  String code)
	     throws MyEntityNotFoundException{
		     deviseService.supprimerDevise(code); //renvoi code 404 en cas d'erreur
		     //car annotation @ResponseStatus(HttpStatus.NOT_FOUND) au dessus de 
		     //la classe MyEntityNotFoundException
	}*/
	
	
	/*
	//en mode DELETE, url=http://localhost:8080/springBootWs/devise-api/public/devise/JPY
	//à tester via PostMan ou un équivalent
	@DeleteMapping(value="/{codeDevise}")
	public ResponseEntity<?> deleteDeviseByCode(@PathVariable("codeDevise")  String code){
		try {
			deviseService.supprimerDevise(code);
			return new ResponseEntity<String>("suppression bien effectuee" , HttpStatus.OK); //suppression bien effectuée
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);//pas trouvé ce qu'il fallait supprimer
			//return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); //erreur quelconque
		}
	}
	*/
	
	/**********************************************************************************************************************************************/
	
	
	
	
	
	
	
	
	
	
	
	
	
	public BookingService getBookingService() {
		return bookingService;
	}

	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}

	public List<Booking> getBookings() {
		return (List<Booking>) bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "BookingCtrl [bookingService=" + bookingService + ", bookings=" + bookings + "]";
	}

	public BookingCtrl(BookingService bookingService, List<Booking> bookings) {
		super();
		this.bookingService = bookingService;
		this.bookings = bookings;
	}

	public BookingCtrl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
