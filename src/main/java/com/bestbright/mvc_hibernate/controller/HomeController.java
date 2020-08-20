package com.bestbright.mvc_hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestbright.mvc_hibernate.model.Classes;
import com.bestbright.mvc_hibernate.model.LoginUser;
import com.bestbright.mvc_hibernate.services.StudentService;

@Controller
public class HomeController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/index.htm")
	public String welcome(Model model){
		model.addAttribute("user", new LoginUser());
		return "login";
	}
	
	@RequestMapping("/check_user.htm")  
    public String submitForm(@Valid @ModelAttribute("user") LoginUser e, BindingResult br)  
    {  
        if(br.hasErrors())  
        {  
        //	model.addAttribute("user",e);
            return "login";  
        }  
        else  
        {  
        	//model.addAttribute("user",e);
        return "final";  
        }  
    }  
	@RequestMapping(value="/new_class.htm",method=RequestMethod.GET)
	public String newClasses(Model model){
		model.addAttribute("classes", new Classes());
		return "new_class";
	}
	@RequestMapping(value="/new_class.htm",method=RequestMethod.POST)
	public String saveClass(@ModelAttribute(value="classes") Classes classes){
		try{
			studentService.saveClass(classes);
		}catch(Exception ex){
			
		}
		return "redirect:/class_list.htm";
	}
	@RequestMapping(value="/class_list.htm")
	public String showClass(Model model) {
		model.addAttribute("classList", studentService.getClassList());
		return "class_list";
	}
	@RequestMapping(value="/contact.htm")
	public String contact(Model model) {
		model.addAttribute("phone", "09256195821");
		return "contact";
	}
}
