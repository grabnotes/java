/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.java.spring;

public class Book {
	String title;
	String genre;
	String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	public Book(String title, String author, String genre) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
	}
	public Book() {
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
