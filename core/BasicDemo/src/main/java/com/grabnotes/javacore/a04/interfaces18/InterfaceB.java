/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;

public interface InterfaceB {
	void printMe();
	
	default void printDefault() {
		System.out.println("Interface B default");
	}
	
	static void printStatic() {
		System.out.println("Interface B's very own method. No one can use it");
	}
}
