package com.wego.web.dao;

import com.wego.web.domains.DepartmentDTO;
import com.wego.web.domains.EmployeeDTO;
import org.springframework.stereotype.Repository;
@Repository 
public interface EmployeeDAO {
	public void insertEmployee(EmployeeDTO param);
	public EmployeeDTO selectByempNoeName(EmployeeDTO param,DepartmentDTO db);
}
