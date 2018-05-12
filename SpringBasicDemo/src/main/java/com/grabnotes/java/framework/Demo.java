package com.grabnotes.java.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo
{
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext( "application-context.xml" );
        Inventory inventory = ( Inventory ) context.getBean( "inventory" );
        System.out.println(inventory.getBookTitle());

    }
}
