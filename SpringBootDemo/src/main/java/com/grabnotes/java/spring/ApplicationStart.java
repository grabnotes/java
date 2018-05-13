/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStart {
	public static void main(String args[]) {
		System.out.println("Application has started");
		SpringApplication.run(ApplicationStart.class, args);
	}
}
