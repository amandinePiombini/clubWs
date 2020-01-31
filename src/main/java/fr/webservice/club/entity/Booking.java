package fr.webservice.club.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_booking")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "id_party")
	private Party party;
	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	
	private Integer nbCLient;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	public Integer getNbCLient() {
		return nbCLient;
	}

	public void setNbCLient(Integer nbCLient) {
		this.nbCLient = nbCLient;
	}

	public Booking(Integer id, Party party, Client client, Integer nbCLient) {
		super();
		this.id = id;
		this.party = party;
		this.client = client;
		this.nbCLient = nbCLient;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", party=" + party + ", client=" + client + ", capacity=" 
				+ ", nbCLient=" + nbCLient + "]";
	}
	
	
}
