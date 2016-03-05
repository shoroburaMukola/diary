package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.diary.domain.Drink;

public interface DrinkRepository extends CrudRepository<Drink, Integer>{

}
