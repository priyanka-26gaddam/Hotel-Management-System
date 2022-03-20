package com.owner.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.owner.model.Department;
import com.owner.repository.DepartmentRepository;

@Service
public class DepartmentService {
		@Autowired
		private DepartmentRepository departmentRepo;
		
		
		public List<Department> getAllDept()
		{
			List<Department> depts = new ArrayList<>();
			departmentRepo.findAll()
			.forEach(depts::add);
			return depts;
		}
		
		public void addDept(Department depts)
		{
			departmentRepo.save(depts);
		}
		
		public void updateDept(int department_id, Department depts) 
		{
			departmentRepo.save(depts);
		}
		
		public void deleteDept(int department_id)
		{
			departmentRepo.deleteById(department_id);
		}

		

	
}

	
