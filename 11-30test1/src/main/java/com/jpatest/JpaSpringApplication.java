package com.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class JpaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSpringApplication.class, args);
		
//		Employee employee = context.getBean(Employee.class);
//		employee.setId(1);
//		employee.setName("wanger");
//		employee.setSalary(5000.00);
//		employee.setDeptId(10);
		
		
	}
}
