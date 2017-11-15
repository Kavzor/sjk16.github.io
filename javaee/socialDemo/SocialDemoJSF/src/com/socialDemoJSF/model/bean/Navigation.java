package com.socialDemoJSF.model.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@ApplicationScoped
@Named
public class Navigation {
	
	private List<Item> items;
	
	private static final String HOME_PATH = "index.xhtml";
	private static final String PROFILE_PATH = "profile.xhtml";
	
	public Navigation() {
		items = new ArrayList<>();
		items.add(new Item("Home", HOME_PATH));
		items.add(new Item("Profile", PROFILE_PATH));
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
