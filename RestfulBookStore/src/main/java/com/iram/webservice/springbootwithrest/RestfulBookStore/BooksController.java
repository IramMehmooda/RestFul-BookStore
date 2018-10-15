package com.iram.webservice.springbootwithrest.RestfulBookStore;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//after @SpringBootapplication the compiler scan for REstController in the package and reaches here
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return Arrays.asList(new Book(1, "Spring","Iram"),new Book(2,"Hibernate","Iram"));
		
	}

}
