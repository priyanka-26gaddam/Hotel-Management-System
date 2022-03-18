package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import com.demo.model.Guest;
import com.demo.repository.GuestRepo;


@Service
public class GuestserviceImpl implements Guestservice {
	//@Transient
	//public static final String SEQUENCE_NAME="guest-sequence";


	@Autowired
	GuestRepo guestRepo;

	@Override
	public Guest addGuest(Guest guest) {
		//guest.setGuestid(service.getSequenceNumber(Guest.SEQUENCE_NAME));
		return guestRepo.insert(guest);
	}

	@Override
	public Guest updateGuest(Guest guest) {
		return guestRepo.save(guest);
	}

	@Override
	public String deleteGuest(int id) {
		guestRepo.deleteById(id);
		return "Deleted Guest Id: " + id;
	}

	@Override
	public Optional<Guest> getGuest(int id) {
		return guestRepo.findById(id);
	}

	@Override
	public List<Guest> getAllGuest() {
		return guestRepo.findAll();
	}

}
