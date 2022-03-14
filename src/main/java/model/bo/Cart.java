package model.bo;

import java.util.*;

public class Cart {
	Collection<Book> books=new ArrayList<Book>();

	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}
	
}
