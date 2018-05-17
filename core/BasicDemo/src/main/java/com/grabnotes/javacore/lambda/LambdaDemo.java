/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.lambda;

public class LambdaDemo{

	public static void main (String args[]) {
		Calculator  add  = (int a, int b) -> {
												return a + b;
											};
		Calculator  sub  = (a, b) -> a - b;
		System.out.println(add.operation(5, 6));
		System.out.println(sub.operation(5, 6));
		
		
		Bank balance2018 = (a) -> a * 1.15;
		Bank balance2019 = (a) -> a * 1.31;
		
		double bal2018 = balance2018.getBalanceWithInterest(500);
		System.out.println("Balance in Year 2018: " + bal2018);
		
		double bal2019 = balance2019.getBalanceWithInterest(bal2018);
		System.out.println("Balance in Year 2019: " + bal2019);
	}
}

interface Calculator {
	int operation(int a, int b);
}

interface Bank {
	double getBalanceWithInterest( double a );
}