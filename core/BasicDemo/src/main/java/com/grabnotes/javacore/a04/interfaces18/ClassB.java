/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;

/**
 * ClassB implements everything from InterfaceA except Static
 * ClassB has to override default method if two interfaces have the same default method name. Otherwise
 * compiler wouldn't know which to choose.
 * @author rathnak
 *
 */
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
