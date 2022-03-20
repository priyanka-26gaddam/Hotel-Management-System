package com.owner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.owner.model.Department;
import com.owner.repository.DepartmentRepository;
import com.owner.service.DepartmentService;



@RunWith(SpringRunner.class)
@SpringBootTest
class OwnerServiceApplicationTests {
	@Autowired
	DepartmentService service;

	@MockBean
	private DepartmentRepository repo;
	@Test
	void contextLoads() {
	}
	

	@Test
	public void getDepartmentTest() {
		when(repo.findAll())
				.thenReturn((List<Department>) Stream
						.of(new Department(1, "manager"),
								new Department(2, "receptionist"))
						.collect(Collectors.toList()));
		assertEquals(2, service.getAllDept().size());
	}


	/* @Test public void getDepartmentByIdTest() { int department_id= 1;
	  when(repo.findById(department_id)).thenReturn(Optional .of(Stream .of(new
	  Department(1,"manager"))
	 .collect(Collectors.toList()))); assertEquals(1,
	  service.getDepartment(department_id)); }*/
	 

	/*@Test
	public void addDeptTest() {
		Department dept = new Department(2,"receptionist" );
		when(repo.insert(dept)).thenReturn(dept);
		assertEquals(2, "receptionist");
	}*/




	/*@Test
	public void updateDeptTest() {
		Department dept = new Department(1, "manager");
		when(repo.save(dept)).thenReturn(dept);
		assertEquals(dept, service.updateDepartment(dept));
	}*/

	/*
	 * @Test public void deleteDeptTest() { Department dept=new
	 * Department(1,"Cooking","Cooking Decsription",10);
	 * service.deleteDepartment(dept); verify(repo.times(1)).delete(dept); }
	 */
}

