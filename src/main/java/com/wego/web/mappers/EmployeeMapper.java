package com.wego.web.mappers;

import com.wego.web.domains.DepartmentDTO;
import com.wego.web.domains.EmployeeDTO;
import org.springframework.stereotype.Repository;
@Repository 
public interface EmployeeMapper {
	public void insertEmployee(EmployeeDTO param);
	public EmployeeDTO selectByempNoeName(EmployeeDTO param,DepartmentDTO db);
}
