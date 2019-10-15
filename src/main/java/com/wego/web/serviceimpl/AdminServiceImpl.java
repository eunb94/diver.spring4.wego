package com.wego.web.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wego.web.mappers.AdminMapper;
import com.wego.web.services.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired AdminMapper adminMapper;
	@Override
	public int findTheNumberOfAdmins() {
		return adminMapper.countAdmins();
		
	}
}