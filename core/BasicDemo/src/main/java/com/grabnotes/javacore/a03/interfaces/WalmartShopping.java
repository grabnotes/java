/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a03.interfaces;

public class WalmartShopping {
	public static void main (String args[])
	{
		Shopping shopping = new ThriftStore();
		System.out.println(shopping.getItemName() + "," + shopping.getPrice());
	}
}
