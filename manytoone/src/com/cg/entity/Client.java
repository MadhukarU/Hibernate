package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Department department = new Department();
		department.setId(100);
		department.setName("TNS");
		
		Employee employee = new Employee();
		employee.setId(12);
		employee.setName("Madhu");
	    employee.setSalary(15000);
		department.addEmployee(employee);
		manager.persist(department);
		manager.getTransaction().commit();
		System.out.println("Added employee details ");
		manager.close();
		factory.close();
		
}
}
