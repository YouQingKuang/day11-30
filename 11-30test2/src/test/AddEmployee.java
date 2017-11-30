package test;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Employee;

public class AddEmployee {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_link");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//增
//		Employee employee = new Employee();
//		employee.setName("zhaaolie");
//		employee.setSalary(5000.00);
//		employee.setDeptId(BigInteger.valueOf(20));
//		em.persist(employee);
		//改
//		Employee employee1 = em.find(Employee.class, "2");
//		employee1.setName("666");
//		em.persist(employee1);
//		//删
//		Employee employee1 = em.find(Employee.class, "2");
//		employee1.setName("666");
//		em.remove(employee1);
		//查
		System.out.println(em.find(Employee.class, "3"));
		
		
		
		
		
		em.getTransaction().commit();
		em.close();

	}
}
