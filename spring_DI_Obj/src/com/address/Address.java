package com.address;

public class Address {
	private String city;
	private String state;
	public Address() {
		
	}
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public String toString() {
		
		return city+"/"+state; 
	}
	
}
