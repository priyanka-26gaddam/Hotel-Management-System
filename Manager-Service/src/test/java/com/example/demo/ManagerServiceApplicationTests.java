package com.example.demo;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.example.demo.model.inventory;
import com.example.demo.repository.inventoryRepository;
import com.example.demo.service.inventoryService;


@SpringBootTest
class ManagerServiceApplicationTests {
	@Autowired
	inventoryService service;
	
	@MockBean
	inventoryRepository repo;
	

	@Test
	void contextLoads() {
	}
	@Test
	public void getInventoryTest() {
		when(repo.findAll())
				.thenReturn(Stream
						.of(new inventory(101,"bislei water"),
							new inventory(101,"bislei water"))
						.collect(Collectors.toList()));
		assertEquals(2, service.getAllInventory().size());
	}

	/*  @Test public void addInventoryTest() {inventory  inventory = new inventory(101,"bislei water");
	  when(repo.insert(inventory)).thenReturn(inventory); assertEquals(inventory,
	  service.addInventory(inventory)); }
	 
	 
	
	
	/*@Test
	public void updateInventoryTest() {
		inventory inventory = new inventory(101,"bislei water");
	when(repo.save(inventory)).thenReturn(inventory); 
	assertEquals(inventory,service.updateInventory(101, inventory));
	}*/
	
	
	
	
	/*@Test
	public inventory  deleteInventoryTest(101,"bislei water") {
	Inventory inventory=new inventory();
	service.deleteInventory(1);
	verify(repo,times(1)).delete(inventory);
	return inventory;
	}*/
}
