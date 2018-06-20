package com.user;

public class User {
	private String name;
	private String postedDate;
	public User(String name, String postedDate) {
		super();
		this.name = name;
		this.postedDate = postedDate;
	}
	
	public String toString() {
		
		return name+"  on  "+postedDate;
	}
}
