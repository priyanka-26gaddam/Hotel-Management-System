package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.ReceptionistInformation;
import com.demo.service.ReceptionistService;

import com.demo.service.ReceptionistService;


@RestController
@RequestMapping("/Receptionist")
public class ReceptionsitController {
	
	@GetMapping("/show")
	public String test() {
		return "Hello Receptionsit";
	} 
	
	
	@Autowired
	private ReceptionistService receptionistService;
	
	
		
	@RequestMapping(method=RequestMethod.POST, value="/addreceptionsit")
	public void addReceptionist(@RequestBody ReceptionistInformation receptionsit)
	{
		receptionistService.addReceptionist(receptionsit);
	}
	
	
	@GetMapping("/receptionist")
	public List<ReceptionistInformation> findAllreceptionist() {
		return receptionistService.getReceptionistInfos();
	}

}
	
