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
@Table(name="club")
public class Club{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_club")
	private Integer id;
	private String name;
	
	@OneToMany(mappedBy = "club",cascade=CascadeType.ALL)
	@JsonIgnore
	private List<Party> parties;

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

	public List<Party> getParties() {
		return parties;
	}

	public void setParties(List<Party> parties) {
		this.parties = parties;
	}

	public Club(Integer id, String name, List<Party> parties) {
		super();
		this.id = id;
		this.name = name;
		this.parties = parties;
	}

	public Club() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", parties=" + parties + "]";
	}
	
	
}
