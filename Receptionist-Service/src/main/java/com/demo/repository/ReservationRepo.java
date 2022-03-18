package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.model.Reservation;


public interface ReservationRepo extends MongoRepository<Reservation, Long> {

	
}