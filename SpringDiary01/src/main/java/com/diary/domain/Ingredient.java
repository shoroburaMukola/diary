package com.diary.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nameOfIngredient;
	private double quantity;
	@ManyToOne
	private Drink drink;
	
	public Ingredient(){
			
	}

	public Ingredient(String nameOfIngredient, double quantity, Drink drink) {
		super();
		this.nameOfIngredient = nameOfIngredient;
		this.quantity = quantity;
		this.drink = drink;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOfIngredient() {
		return nameOfIngredient;
	}

	public void setNameOfIngredient(String nameOfIngredient) {
		this.nameOfIngredient = nameOfIngredient;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", nameOfIngredient="
				+ nameOfIngredient + ", quantity=" + quantity + ", drink="
				+ drink + "]";
	}

	
	
	
}
