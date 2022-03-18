package com.owner.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.owner.model.Department;
import com.owner.service.DepartmentService;


@RestController
//@RequestMapping("/api")
@CrossOrigin(origins ="http://localhost:4200" )

public class DepartmentResource {
    //@Bean
	@Autowired
	private DepartmentService departmentService;
	
	//@Autowired
	//private DepartmentRepository ownerRepo;
	
	@RequestMapping(method=RequestMethod.GET, value="/showdept")
	public List<Department> getAllDept(){
		return departmentService.getAllDept();
	}
	@RequestMapping(method=RequestMethod.POST, value="/adddept")
	public void addDept(@RequestBody Department dept)
	{
		departmentService.addDept(dept);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/updatedept/{department_id}")
	public void updateDept(@RequestBody Department dept, @PathVariable int department_id )
	{
		departmentService.updateDept(department_id,dept);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/deletedept/{department_id}")
	public void deleteDept( @PathVariable int department_id )
	{
		departmentService.deleteDept(department_id);
	}
	
}

