/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.java.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BrowseBooks {

	@GetMapping("/getAuthor")
	@ResponseBody //Send the result to the web response body
	public Book getAuthor(@RequestParam(name="title", required=false, defaultValue="The Adventures of Tom Sawyer")  String bookName)
	{
		Book book = getBookFromDatabase();
		System.out.println("Searching for Title...:" + bookName);
		if (book.getTitle().equals(bookName) ) {
			return book;
		}
		else
		{
			return new Book(bookName, "NOT FOUND");
		}
	}

	public Book getBookFromDatabase() {
		Book book = new Book("The Complete Reference", "Herbert Schildt");
		return book;
	}
	
	public static void main (String args[])
	{
		Book returnedBook = new BrowseBooks().getAuthor("Let Us C"); 
		System.out.println( returnedBook.getTitle() + " : " + returnedBook.getAuthor() );
	}

}
