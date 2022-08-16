package com.cg.service;
import com.cg.entities.student;
public interface studentservice {
public abstract void addstudent(student student);
public abstract void updatestudent(student student);
public abstract void removestudent(student student);
public abstract student findStudentById(int id);
}