/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;

public interface InterfaceB {
	void amuseInterfaceB();
	
	static void interfaceBveryOwn() {
		System.out.println("Interface B's very own method. No one can use it");
	}
	
	default void printInterfaceSolution() {
		System.out.println("Interface A");
	}
}
