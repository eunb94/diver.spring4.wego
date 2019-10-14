package com.wego.web.services;

import com.wego.web.domains.DepartmentDTO;
import com.wego.web.domains.EmployeeDTO;
import org.springframework.stereotype.Component;
@Component
public interface EmployeeService {
	
	public void join(EmployeeDTO param);
	public EmployeeDTO login(EmployeeDTO param,DepartmentDTO db);

}
