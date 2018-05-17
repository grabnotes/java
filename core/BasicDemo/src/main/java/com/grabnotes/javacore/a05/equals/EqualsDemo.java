/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.a05.equals;

import java.util.ArrayList;
import java.util.List;

public class EqualsDemo {

	public boolean isFound(String inputName) {

		boolean isFound = false;

		List<String> nameList = new ArrayList<String>();
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		nameList.add("Mike");

		for (String name : nameList) {
			if (name.equals(inputName)) { // Why isn't it good to do inputName.equals(name)
				isFound = true;
				break;
			}
		}

		return isFound;
	}

	public static void main(String args[]) {
		EqualsDemo demo = new EqualsDemo();
		demo.isFound("aname");

	}

}
