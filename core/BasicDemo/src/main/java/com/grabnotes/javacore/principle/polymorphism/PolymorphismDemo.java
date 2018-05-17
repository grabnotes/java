/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.principle.polymorphism;

public class PolymorphismDemo {
	
	public static void main(String args[])
	{
		Calculator calculator = new StandardCalculator(); //Polymorphism - Dynamic binding
		System.out.println( "Multiply function using StandardCalculator: "
				+ calculator.multiply(2, 4) );
		System.out.println( "Divide function using StandardCalculator: "
				+ calculator.divide(9, 5) );
		
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		System.out.println( "Add function using ScientificCalculator: "
				+ scientificCalculator.add(2, 4, 4) ); //An example of overloading. See this method in class ScientificCalculator
		System.out.println( "Divide function using ScientificCalculator: "
				+ scientificCalculator.divide(9, 5) ); //An example of overriding. See this method in class ScientificCalculator
	}
	
}
