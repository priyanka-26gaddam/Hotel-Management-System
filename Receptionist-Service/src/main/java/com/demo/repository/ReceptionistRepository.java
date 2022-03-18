package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.ReceptionistInformation;


public interface ReceptionistRepository extends MongoRepository<ReceptionistInformation , String> {
	ReceptionistInformation findByEmail(String email);

}