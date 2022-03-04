package com.servlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class UserCountListener
 *
 */
@WebListener
public class UserCountListener implements HttpSessionListener {
	static Integer totalUsers=0;
	static Integer totalActiveUsers=0;
	ServletContext ctx=null;

    public UserCountListener() {
        // TODO Auto-generated constructor stub
    }

    public void sessionCreated(HttpSessionEvent se)  { 
    	totalUsers++;
    	totalActiveUsers++;
    	ctx=se.getSession().getServletContext();
    	ctx.setAttribute("totalUsers", totalUsers);
    	ctx.setAttribute("totalActiveUsers", totalActiveUsers);
    	
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	totalActiveUsers--;
    	ctx.setAttribute("totalActiveUsers", totalActiveUsers);
    }
	
}
