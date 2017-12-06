package com.jensen.spring.mvc.model;

public class Employee implements HasKey{
	private static int AUTO_INCREMENT_KEY = 0;
	
	private String key;
	private String name;
	
	private int age;
	
	public Employee() {
		this.key = String.valueOf(++AUTO_INCREMENT_KEY);
	}

	@Override
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
