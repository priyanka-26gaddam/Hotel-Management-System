package com.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.model.Guest;
import com.demo.repository.GuestRepo;
import com.demo.service.Guestservice;


@RunWith(SpringRunner.class)
@SpringBootTest
class ReceptionistApplicationTests {

	@Autowired
	Guestservice service;

	@MockBean
	private GuestRepo repo;

	@Test
	void contextLoads() {
	
	}
	@Test
	public void getGuestTest() {
		when(repo.findAll())
				.thenReturn(Stream
						.of(new Guest(100, "shiva",9876543, "shiva@gmail.com", "male", "hyd"),
								new Guest(100, "shiva",9876543, "shiva@gmail.com", "male", "hyd"))
						.collect(Collectors.toList()));
		assertEquals(2, service.getAllGuest().size());
	}

	
	
	  @Test public void addGuestTest() { Guest guest = new Guest(100, "shiva",9876543, "shiva@gmail.com", "male", "hyd");
	  when(repo.insert(guest)).thenReturn(guest); assertEquals(guest,
	  service.addGuest(guest)); }
	 
	 
	
	
	@Test
	public void updateGuestTest() {
	Guest guest = new Guest(100, "shiva", 9876543, "shiva@gmail.com", "male", "hyd");
	when(repo.save(guest)).thenReturn(guest); 
	assertEquals(guest,service.updateGuest(guest));
	}
	
	
	
	
	@Test
	public Guest deleteGuestTest() {
	Guest guest=new Guest(100, "shiva", 9876543, "shiva@gmail.com", "male", "hyd");
	service.deleteGuest(1);
	verify(repo,times(1)).delete(guest);
	return guest;
	}
	 
	 
	 
	

}