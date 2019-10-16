package com.wego.web.controllers;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.wego.web.serviceimpl.AdminServiceImpl;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired AdminServiceImpl adminService;
	enum Resources{
		X
	}
	

	@GetMapping("/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome {}.", "HomeController");
		int count = adminService.findTheNumberOfAdmins();	
		model.addAttribute("count", count);
		return "home";
		
	}
	

	
}
