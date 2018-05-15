/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.grabnotes.lib.Inventory;

@Controller
@RequestMapping("/book")	//context path for access all the following methods
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

	@RequestMapping(value = "/category/{genre}", method = RequestMethod.POST)
	@ResponseBody
	public Book getBookByGenre(@PathVariable("genre") String category, @RequestParam("title") String title) {
		
		if ("education".equals(category)) {
			return new Book("The Complete Reference", "education", "Herbert Schildt");
		} else {
			return new Book(); //no book found
		}
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Book getBookByGenre(@RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("genre") String genre) {
		
		return new Book(title, author, genre);
	}
	
	@RequestMapping(value = "/inventory", method = RequestMethod.POST)
	@ResponseBody
	public Book getBook() {
		Book book = inventory.getBook();
		return book;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ResponseBody
	public Book getExactMatch(@RequestBody Book requestedBook) {

		if (inventory.getBook().getTitle().equals(requestedBook.getTitle())
				&& inventory.getBook().getAuthor().equals(requestedBook.getAuthor())
				&& inventory.getBook().getGenre().equals(requestedBook.getGenre())) 
		{
			return inventory.getBook();
		} else {
			return new Book(); // no book found
		}
	}
	
	@Autowired //Make sure @Component and @ComponentScan classes are annotated.
	private Inventory inventory;
	
	
	public static void main (String args[])
	{
		Book returnedBook = new BrowseBooks().getAuthor("Let Us C"); 
		System.out.println( returnedBook.getTitle() + " : " + returnedBook.getAuthor() );
	}
	
	private Book getBookFromDatabase() {
		Book book = new Book("The Complete Reference", "Herbert Schildt");
		return book;
	}

}
