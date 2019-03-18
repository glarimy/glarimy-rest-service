package com.glarimy.rest;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@RequestMapping(value = "/books", method = RequestMethod.GET, produces = "application/json")
	public List<Book> getCustomer() {
		List<Book> books = new LinkedList<>();
		books.add(new Book(1234, "Spring Cloud Applied"));
		books.add(new Book(2345, "Microservices Implemented"));
		return books;
	}

}