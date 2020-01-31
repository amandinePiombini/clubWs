package fr.webservice.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.webservice.club.dao.ClubDao;
import fr.webservice.club.entity.Club;
import fr.webservice.club.entity.Party;

@Service
@Transactional
public class ClubServiceImpl implements ClubService{

	@Autowired
	private ClubDao clubDao;

	@Override
	public List<Club> getAll() {
		// TODO Auto-generated method stub
		return (List<Club>) clubDao.findAll();
	}

	@Override
	public Club getById(Integer id) {
		// TODO Auto-generated method stub
		return clubDao.findById(id).orElse(null);
	}

}
