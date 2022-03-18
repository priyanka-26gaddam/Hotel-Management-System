package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Staff;



public interface StaffMongodbRepo extends MongoRepository<Staff, Long> {

}
