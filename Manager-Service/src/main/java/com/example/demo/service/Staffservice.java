package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Staff;


public interface Staffservice {

	Staff addEmp(Staff emp);

	List<Staff> getAllEmp();

	Optional<Staff> getEmp(long parseLong);

	Staff updateEmp(Staff emp);

	String deleteEmp(long parseLong);

}
