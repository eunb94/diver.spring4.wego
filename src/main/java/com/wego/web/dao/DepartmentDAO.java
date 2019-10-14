package com.wego.web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface DepartmentDAO {
	public List<String> selectDName();
}
