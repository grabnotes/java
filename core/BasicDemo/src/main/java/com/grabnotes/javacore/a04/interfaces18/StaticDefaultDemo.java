/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;

public class StaticDefaultDemo {
	public static void main(String args[])
	{
		InterfaceA interfaceA = new ClassA();
		interfaceA.printMe();
		interfaceA.printDefault();
		InterfaceA.printStatic(); //Note that this is InterfaceA not interfaceA.
	}
}
