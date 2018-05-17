/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.generics;

public class GenericDemo {

	public static void main(String args[])
	{
		Generic<String> generic = new Generic<String>("test");
		String something = generic.getob(); //Note class casting is not required
		if(something.equals("test"))
		{
			System.out.println("the string provided is equal");
		}
		else
		{
			System.out.println("the string provided is NOT equal");
		}
		
	}
	
}
