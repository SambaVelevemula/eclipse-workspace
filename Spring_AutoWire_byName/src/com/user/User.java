package com.user;

public class User {
	private String ans;
	private String name;
	
	
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return ans+" --->  posted by "+name;
	}
}
