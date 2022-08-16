
package com.cg.dao;
import javax.persistence.EntityManager;
import com.cg.entities.student;
public class studentdaoimpl implements studentdao
{
private EntityManager entityManager;
public studentdaoimpl()
{
entityManager = jpautil.getEntityManager();
}
@Override
public student getstudentById(int id) {
student student = entityManager.find(student.class, id);
return student;
}
@Override
public void addstudent(student student) {
entityManager.persist(student);
}
@Override
public void removestudent(student student) {
entityManager.remove(student);
}
@Override
public void updatestudent(student student) {
entityManager.merge(student);
}
@Override
public void beginTransaction() {
entityManager.getTransaction().begin();
}
@Override
public void commitTransaction() {
entityManager.getTransaction().commit();
}
}