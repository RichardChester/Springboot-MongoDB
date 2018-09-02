package com.boot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.boot.model.user;

public interface userRepo extends MongoRepository<user, String>{

	public user findUserByFirstName(String name);
}
