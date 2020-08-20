package com.bestbright.mvc_hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bestbright.mvc_hibernate.model.Classes;
import com.bestbright.mvc_hibernate.model.Student;

@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	public void saveClass(Classes classes){
		getSesssion().save(classes);
	}
	public List<Classes> getClassList(){
		Criteria cr=getSesssion().createCriteria(Classes.class);
		return (List<Classes>)cr.list();
	}
	public void saveStudent(Student std){
		getSesssion().save(std);
	}
	
	public List<Student> getStudentList(){
		
		Criteria cr=getSesssion().createCriteria(Student.class);
		return (List<Student>)cr.list();
	}

	public Student getStudentById(Long id) {
		Criteria cr=getSesssion().createCriteria(Student.class);
		cr.add(Restrictions.eq("id", id));
		return (Student)cr.uniqueResult();
	}
}
