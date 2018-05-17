/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a02.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String args[])
	{
		//Insecure
		Amount insecureAmount = new Amount();
		insecureAmount.setInsecureDeposit(10); //Deposit 10$
		//Modify the deposit
		insecureAmount.insecureDeposit = 9; //Since the deposit amount 
											//can be changed
											//it is insecure
		System.out.println( "Hacked balance: " + insecureAmount.getInsecureBalance() );
		
		//Secure
		Amount secureAmount = new Amount();
		secureAmount.setSecureDeposit(10);
		//Modify the deposit
		//secureAmount.secureDeposit = 9; //Uncommenting this line will lead to compilation error.
											//Since the deposit amount
											//cannot be changed
											//it is secure
		System.out.println( "Secure balance: " + secureAmount.getSecureBalance() );
		
		
		System.out.println( "No of Amount objects created: " );
		//Modify insecure count
		Amount.unreliableCount = 5; //Since this value can be changed
									//it is unreliable
		System.out.println("Unreliable Count: " + Amount.getUnreliableCount() );
		
		//Modify secure count
		//Amount.reliableCount = 5; //Uncommenting this line will lead to compilation error.
									//Since the value cannot be changed
									//it is reliable
		System.out.println("Reliable Count: " + Amount.getReliableCount() );
				
	}

}
