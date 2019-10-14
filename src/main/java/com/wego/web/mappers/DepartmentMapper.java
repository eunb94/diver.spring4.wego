package com.wego.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentMapper {
	public List<String> selectDName();
}
