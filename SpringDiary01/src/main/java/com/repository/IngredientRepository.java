package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.diary.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

}
