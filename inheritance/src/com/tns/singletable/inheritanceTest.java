package com.tns.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class inheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//Create One Employee
		employee employee = new employee();
		employee.setName("Lekha");
		employee.setSalary(5000);
		em.persist(employee);
		
		//Create One Manager
		MGR manager= new MGR();
		manager.setName("Vikas");
		manager.setSalary(6000);
		manager.setDepartmentName("C2TC");
		em.persist(manager);
		
		
		em.getTransaction().commit();
		
		System.out.println("Added One Employee and Manager");
		
		em.close();
		
		factory.close();

	}

}
