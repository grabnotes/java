/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BrowseBooks {
	
	public static void main(String args[])
	{
		//Load the context(through the file)
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Inventory inventory = (Inventory) context.getBean("inventory"); //Dependency injection
		
		System.out.println(inventory.getBookTitle());
		System.out.println(inventory.getGenre());
		
	}
	
}
