package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ManagerInformation;
import com.example.demo.service.ManagerService;

@RestController
@RequestMapping("/Manager")
public class ManagerController {
	
	@GetMapping("/show")
	public String test() {
		return "Hello Manager";
	} 
	
	
	@Autowired
	private ManagerService managerService;
	
	
		
	@RequestMapping(method=RequestMethod.POST, value="/addmanager")
	public void addManager(@RequestBody ManagerInformation Manager)
	{
		managerService.addManager(Manager);
	}
	
	
	@GetMapping("/manager")
	public List<ManagerInformation> findAllMangers() {
		return managerService.getManagerInfos();
	}

}
	
