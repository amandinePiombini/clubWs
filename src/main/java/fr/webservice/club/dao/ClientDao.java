package fr.webservice.club.dao;

import org.springframework.data.repository.CrudRepository;

import fr.webservice.club.entity.Client;

public interface ClientDao  extends CrudRepository<Client, Integer>{

}
