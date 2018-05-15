/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.lib;

import org.springframework.stereotype.Component;

import com.grabnotes.java.spring.Book;

@Component //Make sure @ComponentScan is annotated in the @SpringBootApplication class
public class TXInventory implements Inventory{

	@Override
	public Book getBook() {
		return new Book("Adventures of Tom Sawyer", "Mark Twain", "fiction");
	}

}
