package com.saswat.spring.springmvcjavaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrimitiveController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 12);
		modelAndView.addObject("name", "saswat_sk");
		modelAndView.addObject("salary", 40000);
		return modelAndView;
	}
}
