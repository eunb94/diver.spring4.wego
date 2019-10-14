package com.wego.web.services;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface DepartmentService {
	public List<String> findDName();
}
