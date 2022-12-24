package com.saswat.spring.springmvcjavaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saswat.spring.springmvcjavaconfig.dto.User;

@Controller
public class UserController_ModelMapString {
	@RequestMapping("showRegistration")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "showRegistered", method = RequestMethod.POST)
	public String showRegistered(@ModelAttribute("user") User user, ModelMap modelMap) {
		modelMap.addAttribute("user", user);
		return "successReg";
	}
}
