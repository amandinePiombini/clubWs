package fr.webservice.club.service;

import java.util.Optional;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.webservice.club.dao.ClientDao;
import fr.webservice.club.entity.Client;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientDao clientDao;

	@Override
	public Client getById(Integer id) {
		// TODO Auto-generated method stub
		return clientDao.findById(id).orElse(null);
	}

	
}
