/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.java.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.grabnotes.lib","com.grabnotes.java.spring"}) //If you want the entire project scanned simply specify the base package name @ComponentScan("com.grabnotes.base.name")
public class ApplicationStart {
	public static void main(String args[]) {
		System.out.println("Application has started");
		SpringApplication.run(ApplicationStart.class, args);
	}
}