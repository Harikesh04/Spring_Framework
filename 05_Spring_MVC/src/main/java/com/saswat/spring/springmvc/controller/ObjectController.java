package com.saswat.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saswat.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	@RequestMapping("/employee")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(10);
		employee.setName("saswat");
		employee.setSalary(50000);
		modelAndView.addObject("employee", employee);
		return modelAndView;
	}
}
