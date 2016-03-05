package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.diary.domain.TextKeeper;

public interface TextKeeperRepository extends CrudRepository<TextKeeper, Integer>{

}
