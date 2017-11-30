package com.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpatest.entity.Employees;
import com.jpatest.service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaSpringApplicationTests{
	
	@Autowired
	private EmployeeService employeeService;
	
	@Test
	public void contextLoads() {
//		Employees employee = new Employees();
//		employee.setName("lisi");
//		employee.setSalary(5000.00);
//		employee.setDeptId(20);
		
//		employeeService.addEmployee(employee);
		
		
//		employeeService.deleteEmployees(1L);
		
//		employeeService.updateEmployees(2L, "lalalalal");
		
		System.out.println(employeeService.findEmployee(2L));
		
	}

}
