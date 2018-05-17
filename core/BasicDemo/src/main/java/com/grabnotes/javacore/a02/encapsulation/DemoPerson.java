/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a02.encapsulation;

public class DemoPerson {

	public static void main(String args[]) {
		//Syntax: Object name = new Object();
		Person person = new Person(); //Spell the object name as the classname. Make sure it's lower case.
		
		person.setHeight("6.0");
		person.setName("jack");
		
		System.out.println(person.getHeight());
		System.out.println(person.getName());
	}
}
