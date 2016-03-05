package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.diary.domain.Author;
// інтерфейс наслідує інтерфейс в якому лежать реалізації методів CRUD
// в < > потрібер вказати назву Ентіті класу і тип даних в полі Id
public interface AuthorRepository extends CrudRepository<Author, Integer>{
	// спеціальні методи, наприклад для пошуку, пишемо findBy і дописуємо поле з класу
	// ентіті, в параметри передаємо той тип даних поля і назву самого поля
	Author findByFirstName(String firstName);
	
}
