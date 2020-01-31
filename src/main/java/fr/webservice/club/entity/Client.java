package fr.webservice.club.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_client")
	private Integer id;
	private String nom;
	private String prenom;
	
	@OneToMany(mappedBy = "client",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Booking> bookings;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Client(Integer id, String nom, String prenom, List<Booking> bookings) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.bookings = bookings;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Client [Id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", bookings=" + bookings + "]";
	}
	
	
}
