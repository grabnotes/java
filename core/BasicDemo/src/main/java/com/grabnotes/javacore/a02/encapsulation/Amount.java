package com.grabnotes.javacore.a02.encapsulation;

/**
 * Consider a bank. You deposit money in the bank. 
 * Based on the interest your balance would increase.
 * For this example, interest is 10% for any deposit amount.
 * 
 * @author rathna
 *
 */
public class Amount {
	
	public double insecureDeposit;
	private double secureDeposit;
	public static int unreliableCount;
	private static int reliableCount;
	
	{
		unreliableCount ++;
		reliableCount ++;
	}

	public double getInsecureBalance() {
		return insecureDeposit + insecureDeposit * ((double) 10/100);
	}

	public void setInsecureDeposit(int insecureDeposit) {
		this.insecureDeposit = insecureDeposit;
	}

	public double getSecureBalance() {
		return secureDeposit + secureDeposit * ((double) 10/100);
	}

	public void setSecureDeposit(int secureDeposit) {
		this.secureDeposit = secureDeposit;
	}

	public static int getUnreliableCount() {
		return unreliableCount;
	}

	public static int getReliableCount() {
		return reliableCount;
	}

}
