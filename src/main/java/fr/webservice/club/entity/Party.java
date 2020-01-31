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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="party")
public class Party{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_party")
	private Integer id;
	private String name;
	private String theme;
	private String description;
	private Integer capacity;
	
	@ManyToOne
	@JoinColumn(name = "id_club")
	private Club club;
	
	@OneToMany(mappedBy =  "party",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Booking> bookings;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", theme=" + theme + ", description=" + description
				+ ", capacity=" + capacity + ", club=" + club + ", bookings=" + bookings + "]";
	}

	public Party(Integer id, String name, String theme, String description, Integer capacity, Club club,
			List<Booking> bookings) {
		super();
		this.id = id;
		this.name = name;
		this.theme = theme;
		this.description = description;
		this.capacity = capacity;
		this.club = club;
		this.bookings = bookings;
	}

	public Party() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	
}
