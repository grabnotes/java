/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.principle.polymorphism;

public class StandardCalculator implements Calculator{
	
	public int add (int a, int b)
	{
		return a + b;
	}
	public int subtract (int a, int b)
	{
		return a - b;
	}
	public int multiply (int a, int b)
	{
		return a * b;
	}
	public double divide (int a, int b)
	{
		return a / b;
	}
}
