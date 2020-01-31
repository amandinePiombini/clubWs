package fr.webservice.club.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.webservice.club.entity.Party;

public interface PartyDao  extends CrudRepository<Party, Integer>{

	List<Party> findByClubId(Integer idClub);
}
