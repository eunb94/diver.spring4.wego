package com.wego.web.factory;

import java.sql.Connection;
import java.sql.DriverManager;

import com.wego.web.enums.DBDriver;
import com.wego.web.enums.DBUrl;
import com.wego.web.pool.Constants;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(DBUrl.ORACLE_URL.toString()
					,Constants.USERNAME,Constants.PASSWORD);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return conn;
	}

}
