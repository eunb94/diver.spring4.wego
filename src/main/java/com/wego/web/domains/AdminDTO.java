package com.wego.web.domains;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data @Component
public class AdminDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String eid, pwd, empNo,eName,job,mgr,hireDate,sal,comm,deptNo;

}
