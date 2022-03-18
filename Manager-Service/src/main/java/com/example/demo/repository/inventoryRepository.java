package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.inventory;


public interface inventoryRepository extends MongoRepository<inventory, Integer>{
	public inventory findById(int inventory_id);

}
