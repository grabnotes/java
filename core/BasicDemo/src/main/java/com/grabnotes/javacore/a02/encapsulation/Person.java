package com.grabnotes.javacore.a02.encapsulation;

public class Person {
	private String height; // private is an access modifier
	private String name;

	public String getHeight() {
		return height;
	}

	public void setHeight(String heightInput) {
		this.height = heightInput;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameInput) {
		this.name = nameInput;
	}
}

