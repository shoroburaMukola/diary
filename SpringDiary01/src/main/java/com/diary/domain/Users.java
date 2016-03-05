package com.diary.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String secondName;
	private int age;
	private String email;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<TextKeeper> textKeepers;

	public Users() {

	}

	public Users(String firstName, String secondName, int age, String email,
			List<TextKeeper> textKeepers) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.email = email;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<TextKeeper> getTextKeepers() {
		return textKeepers;
	}

	public void setTextKeepers(List<TextKeeper> textKeepers) {
		this.textKeepers = textKeepers;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", secondName="
				+ secondName + ", age=" + age + ", email=" + email + "]";
	}

}
