package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Guest;


@Repository
public interface GuestRepo extends MongoRepository<Guest, Integer> {

}