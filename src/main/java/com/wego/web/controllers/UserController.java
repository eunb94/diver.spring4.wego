package com.wego.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wego.web.domains.UserDTO;

	@Controller
	@RequestMapping("/user/*")
	public class UserController {
		private static final Logger logger = LoggerFactory.getLogger(UserController.class);
		@Autowired Map<String, Object> map;
		
		@PostMapping("/join")
		public @ResponseBody Map<String, String> join(@RequestBody UserDTO user){
			logger.info("AJAX가 보낸 아이디와 비번{}", user.getUid()+", "+user.getPwd());
			HashMap<String, String> map = new HashMap<>();
			map.put("uid", user.getUid());
			map.put("pwd", user.getPwd());
			logger.info("map에 담긴아이디와 비번{}+", map.get("uid"),map.get("pwd"));
			return map;
		}
}
