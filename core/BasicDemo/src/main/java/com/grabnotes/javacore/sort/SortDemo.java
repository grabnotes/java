/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	public static void main(String args[])
	{
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("John", 10));
		personList.add(new Person("Abraham", 30));
		personList.add(new Person("Richard", 20));
		
		System.out.println("-------Sorting By Name using Comparable--------");
		Collections.sort(personList);
		
		for(Person p : personList)
		{
			System.out.println(p.getName() + ":" + p.getAge());
		}
		
		System.out.println("-------Sorting By Age using Comparator--------");
		Collections.sort(personList, new PersonAgeSort());
		for(Person p : personList)
		{
			System.out.println(p.getName() + ":" + p.getAge());
		}
	}
}
