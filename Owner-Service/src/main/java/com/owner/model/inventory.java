package com.owner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Inventory")
public class inventory {
     
	@Id
	private int inventory_id;
	private String inventory_name;
	public inventory() {
		super();
	}
	public inventory(int inventory_id, String inventory_name) {
		super();
		this.inventory_id = inventory_id;
		this.inventory_name = inventory_name;
	}
	public int getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}
	public String getInentory_name() {
		return inventory_name;
	}
	public void setInventory_name(String inventory_name) {
		this.inventory_name = inventory_name;
	}
	@Override
	public String toString() {
		return "inventory [inventory_id=" + inventory_id + ", inventory_name=" + inventory_name + "]";
	}
	
	
	
}
