package com.cg.dao;

import com.cg.entities.student;
public interface studentdao {
public abstract student getstudentById(int id);
public abstract void addstudent(student student);
public abstract void removestudent(student student);
public abstract void updatestudent(student student);
public abstract void commitTransaction();
public abstract void beginTransaction();
}