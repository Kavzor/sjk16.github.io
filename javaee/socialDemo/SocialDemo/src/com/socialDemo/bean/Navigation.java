package com.socialDemo.bean;

import java.util.ArrayList;
import java.util.List;

public class Navigation {
	
	private List<String> items;
	
	public Navigation() {
		items = new ArrayList<>();
		items.add("Home");
		items.add("Profile");
		items.add("Info");
		items.add("Contact");
	}
	
	public List<String> getItems(){
		return items;
	}
}
