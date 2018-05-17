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
	public void amuseInterfaceB() {
		System.out.println("ClassA amusing InterfaceB");
	}

	@Override
	public void printInterfaceSolution() {
		// TODO Auto-generated method stub
		InterfaceB.super.printInterfaceSolution();
	}

}
