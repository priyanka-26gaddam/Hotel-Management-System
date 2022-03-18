package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ManagerInformation;
import com.example.demo.repository.ManagerRepository;

@Service
public class ManagerService {

	@Autowired
	private ManagerRepository managerRepo;

	
	public List<ManagerInformation> getManagerInfos() {
		List<ManagerInformation> managerInfos = managerRepo.findAll();
		System.out.println("Getting Manager from DB" + managerInfos);
		return managerInfos;
	}


	
	public void addManager(ManagerInformation manager)
	{
		managerRepo.save(manager);
	}







	



	
}
	
	
