package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.inventory;

import com.example.demo.repository.inventoryRepository;


@Service
public class inventoryService {
		@Autowired
		private inventoryRepository inventoryRepo;
		
		
		public List<inventory> getAllInventory()
		{
			List<inventory> inventorys = new ArrayList<>();
			inventoryRepo.findAll()
			.forEach(inventorys::add);
			return inventorys;
		}
		
		public void addInventory(inventory inventorys)
		{
			inventoryRepo.save(inventorys);
		}
		
		public void updateInventory(int inventory_id, inventory inventorys) 
		{
			inventoryRepo.save(inventorys);
		}
		
		public void deleteInventory(int inventory_id)
		{
			inventoryRepo.deleteById(inventory_id);
		}

		
}

	
