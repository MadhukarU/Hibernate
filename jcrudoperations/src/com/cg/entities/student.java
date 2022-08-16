package com.cg.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="student")
public class student implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setstudentId(int i) {
		// TODO Auto-generated method stub
		
	}
	public String getstudentId1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getstudentId() {
		// TODO Auto-generated method stub
		return null;
	}
}
