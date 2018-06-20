package com.user;

public class User {
	private int id;
	private String name;
	private String ans;
	private String posted_on;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
	public String getPosted_on() {
		return posted_on;
	}
	public void setPosted_on(String posted_on) {
		this.posted_on = posted_on;
	}
	
	public String toString() {
		return ans+" ----> posted by "+id+"  name : "+name+"  on : "+posted_on;
	}
}
