package fr.webservice.club.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.webservice.club.entity.Booking;
import fr.webservice.club.entity.Club;
import fr.webservice.club.entity.Party;

public interface ClubDao extends CrudRepository<Club, Integer>  {

}
