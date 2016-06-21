package com.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student", "command", new Student());
	}
	
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringMVCFormHandling")Student student, ModelMap m){
		m.addAttribute("id", student.getId());
		m.addAttribute("name", student.getName());
		m.addAttribute("age", student.getAge());
		return "result";
	}
	
}
