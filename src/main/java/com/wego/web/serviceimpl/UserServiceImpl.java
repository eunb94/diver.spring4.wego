package com.wego.web.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wego.web.domains.UserDTO;
import com.wego.web.mappers.UserMapper;
import com.wego.web.services.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired UserMapper userMapper;
	@Autowired UserDTO user;

	@Override
	public UserDTO login(UserDTO param) {
		
		return userMapper.selectUserById(param);
	}

	@Override
	public void join(UserDTO param) {
		userMapper.insertUser(param);
		
	}



	}


