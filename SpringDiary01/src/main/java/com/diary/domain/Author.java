package com.diary.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String secondName;
	@Temporal(TemporalType.DATE)
	private Date dataBorn;
	@Temporal(TemporalType.DATE)
	private Date dataDie;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "author")
	private List<TextKeeper> textKeepers;

	public Author() {

	}

	public Author(String firstName, String secondName, Date dataBorn,
			Date dataDie, List<TextKeeper> textKeepers) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.dataBorn = dataBorn;
		this.dataDie = dataDie;
		this.textKeepers = textKeepers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public Date getDataBorn() {
		return dataBorn;
	}

	public void setDataBorn(Date dataBorn) {
		this.dataBorn = dataBorn;
	}

	public Date getDataDie() {
		return dataDie;
	}

	public void setDataDie(Date dataDie) {
		this.dataDie = dataDie;
	}

	public List<TextKeeper> getTextKeepers() {
		return textKeepers;
	}

	public void setTextKeepers(List<TextKeeper> textKeepers) {
		this.textKeepers = textKeepers;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", dataBorn=" + dataBorn
				+ ", dataDie=" + dataDie + "]";
	}
	
	
}
