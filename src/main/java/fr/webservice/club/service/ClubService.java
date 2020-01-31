package fr.webservice.club.service;

import java.util.List;

import fr.webservice.club.entity.Club;
import fr.webservice.club.entity.Party;

public interface ClubService {

	List<Club> getAll();
	
	Club getById(Integer id);
	
}
