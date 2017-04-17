package com.hemendra.thymeboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hemendra.thymeboot.models.User;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String index(Model model){
		User user = new User("Hemendra", 123, "hemendra7011@gmail.com");
		model.addAttribute("user", user);
		return "index";
	}

}
