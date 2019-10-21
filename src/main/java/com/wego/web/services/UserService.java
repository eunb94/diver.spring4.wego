package com.wego.web.services;

import org.springframework.stereotype.Component;

import com.wego.web.domains.UserDTO;
@Component
public interface UserService {
	public UserDTO login(UserDTO param);
	public void join(UserDTO param);
	
}
