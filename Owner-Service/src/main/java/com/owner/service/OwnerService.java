package com.owner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owner.model.Owner;
import com.owner.repository.OwnerRepository;



@Service
public class OwnerService {

	@Autowired
	private OwnerRepository Repo;

	
	public  List<Owner> getOwnerInfos() {
		List<Owner> ownerInfos = Repo.findAll();
		System.out.println("Getting Owner from DB" + ownerInfos);
		return ownerInfos;
	}


	
	public void addOwner(Owner owner)
	{
		Repo.save(owner);
	}
}
	