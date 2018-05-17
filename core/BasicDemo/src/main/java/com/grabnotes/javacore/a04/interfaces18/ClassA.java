/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;
/**
 * ClassA implements everything from InterfaceA except Static
 * ClassA has to override default method if two interfaces have the same default method name. Otherwise
 * compiler wouldn't know which to choose.
 * @author rathnak
 *
 */
public class ClassA implements InterfaceA, InterfaceB{

	@Override
	public void printMe() {
		System.out.println("ClassA");
		
	}

	@Override
	public void printDefault() {
		InterfaceA.super.printDefault();
	}

}
