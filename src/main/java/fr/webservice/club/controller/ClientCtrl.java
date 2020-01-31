package fr.webservice.club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.webservice.club.service.ClientService;

@RestController
@RequestMapping(value="/client-api/public/client", headers="Accept=application/json")
//@Api(tags = { "My REST Devise api (public part)" })
@CrossOrigin("*")
public class ClientCtrl {
	
	@Autowired
	private ClientService clientService;
	
	

}
