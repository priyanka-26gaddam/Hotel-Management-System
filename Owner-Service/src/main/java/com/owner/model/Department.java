package com.owner.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

@Document("department")
public class Department {
    @Id
	private int department_id;
    @Field
	private String department_name;
   	
	public Department() {
		super();
	}
	
	public Department(int department_id, String department_name) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
	}

	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
}
