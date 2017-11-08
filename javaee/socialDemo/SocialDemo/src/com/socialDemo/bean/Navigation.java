package com.socialDemo.bean;

import java.util.ArrayList;
import java.util.List;

public class Navigation {
	
	private List<Item> items;
	
	public Navigation() {
		items = new ArrayList<>();
		items.add(new Item("Home", "index.jsp"));
		items.add(new Item("Profile", "profile"));
		items.add(new Item("Info", "info.jsp"));
		items.add(new Item("Contact", "contact.jsp"));
	}
	
	public List<Item> getItems(){
		return items;
	}
	
	public static class Item {
		private String name;
		private String path;
		
		public Item(String name, String path) {
			this.name = name;
			this.path = path;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}
	}
}
