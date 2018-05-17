package com.grabnotes.javacore.generics;

public class Generic<Type> {
	Type ob;

	Generic(Type o) {
		ob = o;
	}

	Type getob() {
		return ob;
	}

	void printType() {
		System.out.println("Type of T is" + ob.getClass().getName());
	}

}
