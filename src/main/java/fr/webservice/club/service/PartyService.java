package fr.webservice.club.service;

import java.util.List;

import fr.webservice.club.entity.Party;

public interface PartyService {
	
	Party getById(Integer id);

	Party createParty(Party p);
	
	List<Party> getAll();
	
	List<Party> getAllPartyByClub(Integer idClub);
	
	Party updateCapacity(Integer capacity);
}
