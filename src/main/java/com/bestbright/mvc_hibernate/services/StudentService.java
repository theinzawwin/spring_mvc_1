package com.bestbright.mvc_hibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.mvc_hibernate.dao.StudentDao;
import com.bestbright.mvc_hibernate.model.Classes;
import com.bestbright.mvc_hibernate.model.Student;


@Service
@Transactional
public class StudentService {
	@Autowired
	StudentDao studentDao;
	@Transactional
	public void saveClass(Classes classes) throws Exception{
		try{
			studentDao.saveClass(classes);
		}catch(Exception ex){
			throw ex;
		}
	}
	public List<Classes> getClassList(){
		return studentDao.getClassList();
	}
	
	public void saveStudent(Student std) {
		studentDao.saveStudent(std);
	}
	public List<Student> getStudentList(){
		return studentDao.getStudentList();
	}
}
