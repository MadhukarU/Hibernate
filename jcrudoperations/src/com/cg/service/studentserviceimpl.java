package com.cg.service;
import com.cg.dao.studentdao;
import com.cg.dao.studentdaoimpl;
import com.cg.entities.student;
public class studentserviceimpl implements studentservice {
private studentdao dao;
public studentserviceimpl()
{
dao = new studentdaoimpl();
}
@Override
public void addstudent(student student) {
dao.beginTransaction();
dao.addstudent(student);
dao.commitTransaction();
}
@Override
public void updatestudent(student student) {
dao.beginTransaction();
dao.updatestudent(student);
dao.commitTransaction();
}
@Override
public void removestudent(student student) {
dao.beginTransaction();
dao.removestudent(student);
dao.commitTransaction();
}
@Override
public student findStudentById(int id) {
//no need of transaction, as it's an read operation
student student = dao.getstudentById(id);
return student;
}
}