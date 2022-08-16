	package com.cg.client;
	import com.cg.entities.student;
	import com.cg.service.studentservice;
	import com.cg.service.studentserviceimpl;
	public class client
	{
	public static void main(String[] args)
	{
		
	studentservice service = new studentserviceimpl();
	student student = new student();
	
	student.setstudentId(100);
	student.setName("Sachin");
	service.addstudent(student);
	
	student = service.findStudentById(100);
	System.out.print("ID:"+student.getstudentId());
	System.out.println(" Name:"+student.getName());
	
	student = service.findStudentById(100);
	student.setName("Sachin Tendulkar");
	service.updatestudent(student);
	
	student = service.findStudentById(100);
	System.out.print("ID:"+student.getstudentId());
	System.out.println(" Name:"+student.getName());
	
	
	student = service.findStudentById(100);
	service.removestudent(student);
	System.out.println("End of program/Life cycle completed...");
	}
	}
