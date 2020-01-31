package fr.webservice.club.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.webservice.club.dao.PartyDao;
import fr.webservice.club.entity.Party;

@Service
@Transactional
@WebService(endpointInterface = "fr.webservice.club.service.PartyService")
public class PartyServiceImpl implements PartyService{

	@Autowired
	private PartyDao partyDao;
	
	@Override
	public Party getById(Integer id) {
		// TODO Auto-generated method stub
		return partyDao.findById(id).orElse(null);
	}

	@Override
	public Party createParty(Party p) {
		// TODO Auto-generated method stub
		return partyDao.save(p);
	}

	@Override
	public List<Party> getAllPartyByClub(Integer idClub) {
		// TODO Auto-generated method stub
		return partyDao.findByClubId(idClub);
	}

	@Override
	public List<Party> getAll() {
		// TODO Auto-generated method stub
		return (List<Party>) partyDao.findAll();
	}

	@Override
	public Party updateCapacity(Integer nb) {
		Integer id = 1;
		Party p = getById(id);
		Integer capacity = p.getCapacity();
		if(capacity>nb) {
			p.setCapacity(capacity-nb);
		}else {
			System.out.println("pas assez");
		}
		return partyDao.save(p);
	}

}
