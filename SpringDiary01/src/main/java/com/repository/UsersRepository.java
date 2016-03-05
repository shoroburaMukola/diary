package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.diary.domain.Users;

public interface UsersRepository extends CrudRepository<Users, Integer>{

}
