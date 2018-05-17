package com.grabnotes.javacore.a01.object;

public class Person {
	String height;
	String name;
	
	public static void main(String args[]) {
		//Syntax: Object name = new Object();
		Person person = new Person(); //Spell the object in camelCase similar to object
		
		person.height = "6.0";
		person.name = "jack";
		
		System.out.println(person.height);
		System.out.println(person.name);
	}

}