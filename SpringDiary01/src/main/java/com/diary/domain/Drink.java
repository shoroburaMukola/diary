package com.diary.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Drink {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameOfDrink;
	private String recipe;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "drink")
	private List<Ingredient> ingrediens;
	
	public Drink(){
		
	}

	public Drink(String nameOfDrink, String recipe, List<Ingredient> ingrediens) {
		super();
		this.nameOfDrink = nameOfDrink;
		this.recipe = recipe;
		this.ingrediens = ingrediens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfDrink() {
		return nameOfDrink;
	}

	public void setNameOfDrink(String nameOfDrink) {
		this.nameOfDrink = nameOfDrink;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	public List<Ingredient> getIngrediens() {
		return ingrediens;
	}

	public void setIngrediens(List<Ingredient> ingrediens) {
		this.ingrediens = ingrediens;
	}

	@Override
	public String toString() {
		return "Drink [id=" + id + ", nameOfDrink=" + nameOfDrink + ", recipe="
				+ recipe + "]";
	}
	
	

}
