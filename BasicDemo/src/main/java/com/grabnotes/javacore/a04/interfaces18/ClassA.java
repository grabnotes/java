/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a04.interfaces18;
/**
 * ClassA implements everything from InterfaceA except Static
 * ClassA has to override default method if two interfaces have the same default method name. Otherwise
 * compiler would'nt know which to choose.
 * @author rathnak
 *
 */
public class ClassA implements InterfaceA, InterfaceB{

	@Override
	public void printMe() {
		System.out.println("Printing from ClassA");
		
	}

	@Override
	public void amuseInterfaceB() {
		System.out.println("ClassA amusing InterfaceB");
		
	}

	@Override
	public void printInterfaceSolution() {
		// TODO Auto-generated method stub
		InterfaceA.super.printInterfaceSolution();
	}
	
	public static void main(String args[])
	{
		InterfaceA interfaceA = new ClassA();
		ClassA classA = new ClassA();
		InterfaceA.interfaceAveryOwn();
		
	}

}
