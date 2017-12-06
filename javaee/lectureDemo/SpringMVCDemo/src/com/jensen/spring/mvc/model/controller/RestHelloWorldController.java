package com.jensen.spring.mvc.model.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//RestController gör så att alla utskrifter sker i default JSON
//RestController menar att vi retunerar data
public class RestHelloWorldController {

	@RequestMapping(
			path = "/restHelloWorld",
			method = RequestMethod.GET,
			produces = "application/json")
	public List<Person> printRestHelloWorld() {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Hello"));
		list.add(new Person("World"));
		
		return list;
	}
	
	public static class Person{
		private String username;
		public Person(String username) {
			this.username = username;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		
	}
}
