package com.jpatest.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.jpatest.entity.Employees;

@Service
public class EmployeeService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addEmployee(Employees emp) {
		System.out.println(emp);
		entityManager.persist(emp);
	}
	
	@Transactional
	public void deleteEmployees(long id) {
		Employees emp = entityManager.find(Employees.class, id);
		entityManager.remove(emp);
	}
	
	@Transactional
	public void updateEmployees(long id,String name) {
        Employees emp = entityManager.find(Employees.class, id);
        emp.setName(name);
        entityManager.persist(emp);
	}

	@Transactional
	public Employees findEmployee(long id) {
		Employees employee = entityManager.find(Employees.class, id);
		return employee;
	}
	
}
