package com.servlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class UserAttributeListener
 *
 */
@WebListener
public class UserAttributeListener implements HttpSessionAttributeListener {

    public UserAttributeListener() {
        // TODO Auto-generated constructor stub
    }


    public void attributeAdded(HttpSessionBindingEvent se)  { 
        String attributename=se.getName();
        String attributevalue=(String)se.getValue();
        System.out.println("\nNew"+attributename+" has been added having name: "+attributevalue);
    }


    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	String attributename=se.getName();
        String attributevalue=(String)se.getValue();
        System.out.println("\nNew"+attributename+" has been removed having name: "+attributevalue);
    }

	
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	String attributename=se.getName();
        String attributevalue=(String)se.getValue();
        System.out.println("\nNew"+attributename+" has been modified having name: "+attributevalue);
    }
	
}
