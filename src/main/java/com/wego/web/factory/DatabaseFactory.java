package com.wego.web.factory;

import com.wego.web.enums.DB;
import com.wego.web.pool.Constants;
public class DatabaseFactory {
	
	public static Database createDatabase(String vendor) {
		Database db = null;
		switch (DB.valueOf(vendor)) {
		case ORACLE: db = new Oracle();
			
		  break;

		default:
			break;
		}
		
		return db;	
	}
	

}
