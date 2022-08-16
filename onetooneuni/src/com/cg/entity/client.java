package com.cg.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		student student = new student();
		student.setId(100);
		student.setName("cmca");

		address address=new address();
		address.setAddress_id(200);
		
		address.setStreet("xyz");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setZipcode("560042");


		student.setAddress(address);

		manager.persist(student);
		manager.getTransaction().commit();
		System.out.println("Added one Student details ");
		manager.close();
		factory.close();
	}

}
