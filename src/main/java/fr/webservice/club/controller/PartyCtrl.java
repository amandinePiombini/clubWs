package fr.webservice.club.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.webservice.club.entity.Client;
import fr.webservice.club.entity.Party;
import fr.webservice.club.service.PartyService;

@RestController
@RequestMapping(value="/party-api/public/party", headers="Accept=application/json")
//@Api(tags = { "My REST Devise api (public part)" })
@CrossOrigin("*")
public class PartyCtrl {
	
	@Autowired
	private PartyService partyService;
	
	@GetMapping(value="/liste")
	public List<Party> getAllPartyByClub(){
		return partyService.getAll();
	}
	
	@GetMapping(value="/partyList/{id}")
	public List<Party> getAllPartyByClub(@PathVariable("id")Integer id){
		return partyService.getAllPartyByClub(id);
	}
	
	@GetMapping(value="/liste/{id}}")
	public Party getPartyById(@PathVariable("id")Integer id) {
	
		return partyService.getById(id);
	}

}
