package com.diary.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class TextKeeper {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String text;
	@Column(name = "typeOfText")
	@Enumerated(EnumType.ORDINAL)
	private TypeOfText typeOfText;
	@ManyToOne
	private Author author;
	@ManyToOne
	private Users user;

	
	
	public TextKeeper() {

	}



	public TextKeeper(String text, TypeOfText typeOfText, Author author,
			Users user) {
		super();
		this.text = text;
		this.typeOfText = typeOfText;
		this.author = author;
		this.user = user;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public TypeOfText getTypeOfText() {
		return typeOfText;
	}



	public void setTypeOfText(TypeOfText typeOfText) {
		this.typeOfText = typeOfText;
	}



	public Author getAuthor() {
		return author;
	}



	public void setAuthor(Author author) {
		this.author = author;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "TextKeeper [id=" + id + ", text=" + text + ", typeOfText="
				+ typeOfText + ", author=" + author + ", user=" + user + "]";
	}
	

	
	
}
