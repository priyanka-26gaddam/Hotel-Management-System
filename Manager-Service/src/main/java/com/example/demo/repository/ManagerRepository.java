package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.ManagerInformation;


public interface ManagerRepository extends MongoRepository<ManagerInformation , String> {
	
	ManagerInformation findByEmail(String email);

}