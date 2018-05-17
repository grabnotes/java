/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/package com.grabnotes.javacore.sort;

import java.util.Comparator;

public class PersonAgeSort implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		int i = p1.getAge() - p2.getAge();
		System.out.println(i);
		return i;
	}

}
