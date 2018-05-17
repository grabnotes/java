/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;

/**
 * Examples of 'default' and 'static' methods in interfaces
 * 
 * @author rathnak
 *
 */
public interface InterfaceA {
	
	void printMe();
	
	default void printDefault() {
		System.out.println("Interface A default");
	}
	
	static void printStatic() {
		System.out.println("Interface A's very own method. No one can use it");
	}
}
