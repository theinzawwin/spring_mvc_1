package com.bestbright.mvc_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestbright.mvc_hibernate.model.Student;
import com.bestbright.mvc_hibernate.services.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/new_student.htm")
	public String createStudent(Model model) {
		model.addAttribute("std", new Student());
		model.addAttribute("clList", studentService.getClassList());
		return "new_student";
	}
	@RequestMapping(value="/new_student.htm",method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute(value="std") Student std) {
		studentService.saveStudent(std);
		return "redirect:/student_list.htm";
	}
	@RequestMapping(value="/student_list.htm")
	public String showStudent(Model model) {
		model.addAttribute("students", studentService.getStudentList());
		return "student_list";
	}
	
}
