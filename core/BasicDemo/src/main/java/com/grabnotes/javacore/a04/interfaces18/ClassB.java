/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;

public class ClassB implements InterfaceA, InterfaceB{

	@Override
	public void printMe() {
		System.out.println("ClassB");
		
	}

	@Override
	public void printDefault() {
		InterfaceB.super.printDefault();
	}

}
