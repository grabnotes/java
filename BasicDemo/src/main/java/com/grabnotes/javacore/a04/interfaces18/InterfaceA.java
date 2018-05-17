/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;

public interface InterfaceA {
	
	static void interfaceAveryOwn() {
		System.out.println("Interface A's very own method. No one can use it");
	}
	
	default void printInterfaceSolution() {
		System.out.println("Interface A");
	}
	void printMe();
	
}
