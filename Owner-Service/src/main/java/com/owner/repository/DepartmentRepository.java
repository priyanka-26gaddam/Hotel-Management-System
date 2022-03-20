package com.owner.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.owner.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, Integer>{
	public Department findById(int department_id);

}
