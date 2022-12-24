package com.saswat.spring.springmvcjavaconfig.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saswat.spring.springmvcjavaconfig.dto.Employee;

@Controller
public class ListController {
	@RequestMapping("/employeelist")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		Employee employee1 = new Employee();
		employee1.setId(10);
		employee1.setName("saswat");
		employee1.setSalary(50000);
		Employee employee2 = new Employee();
		employee2.setId(11);
		employee2.setName("kanha");
		employee2.setSalary(40000);
		Employee employee3 = new Employee();
		employee3.setId(10);
		employee3.setName("raja");
		employee3.setSalary(60000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

//		modelAndView.addObject(arrayList);
		modelAndView.addObject("employeeList", employeeList);
		return modelAndView;
	}
}
