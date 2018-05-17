package com.grabnotes.javacore.principle.polymorphism;

public class ScientificCalculator extends StandardCalculator implements Calculator{
	
	//Polymorphism - Method overloading
	public int add (int a, int b, int c)
	{
		return a + b + c;
	}

	//Polymorphism - Method overriding
	public double divide (int a , int b)
	{
		return (double) a/b;
	}
	
}
