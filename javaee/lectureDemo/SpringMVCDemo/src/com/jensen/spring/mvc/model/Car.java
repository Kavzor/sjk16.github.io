package com.jensen.spring.mvc.model;

public class Car implements HasKey {
	private static int AUTO_INCREMENT_KEY = 0;
	
	private String key;
	private String reg;
	
	private int age;
	
	public Car() {
		this.key = String.valueOf(++AUTO_INCREMENT_KEY);
	}

	@Override
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
