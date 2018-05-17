/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.abstracts;

public class AbstractDemo {

	public static void main(String args[])
	{
		Vehicle vehicle = new Car();
		System.out.println("This vehicle has a " + vehicle.getEngine() 
								+ " engine with " + vehicle.getWheels() + " "
								+ vehicle.getWheelBrand() + " wheels");
		
		Vehicle vehicle2 = new Truck();
		System.out.println("This vehicle has a " + vehicle2.getEngine() 
				+ " engine with " + vehicle2.getWheels() + " "
				+ vehicle2.getWheelBrand() + " wheels");
		
	}
	
}
