package com.wego.web.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wego.web.mappers.DepartmentMapper;
import com.wego.web.services.DepartmentService;

@Service

public class DepartmentServiceImpl implements DepartmentService{
	@Autowired DepartmentMapper mapper;
	@Override
	public List<String> findDName() {
		
		return null;
	}

}