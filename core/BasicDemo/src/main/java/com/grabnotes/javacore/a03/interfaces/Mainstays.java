package com.grabnotes.javacore.a03.interfaces;

public class Mainstays implements Shopping{

	public String getItemName() {
		return "Mainstays Umbrella";
	}

	public String getPrice() {
		//if winter season then its 10$ otherwise 5$
		return "10$";
	}
	
	public String getTotalItems() {
		return "1001";
	}

}
