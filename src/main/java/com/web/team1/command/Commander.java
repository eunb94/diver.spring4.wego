package com.web.team1.command;

import javax.servlet.http.HttpServletRequest;

import com.web.team1.enums.Action;

public class Commander {

	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE : cmd = null; break;
		case SEARCH : cmd = null; break;
		case MOVE : cmd = null; break;
		case LOGIN : cmd = null; break;
		default : break; 
		}
		return cmd;
	}
}
