package com.owner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.owner.model.Owner;



public interface OwnerRepository extends MongoRepository<Owner , Integer> {
	
}
