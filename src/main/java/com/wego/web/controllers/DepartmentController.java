package com.wego.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wego.web.services.DepartmentService;

@Controller
public class DepartmentController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired DepartmentService departmentService;
}
