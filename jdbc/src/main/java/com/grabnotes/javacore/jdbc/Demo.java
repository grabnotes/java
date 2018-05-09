/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.jdbc;

public class Demo {
	public static void main(String args[]) {
		try {
			MySqlConnect.getConnection();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
