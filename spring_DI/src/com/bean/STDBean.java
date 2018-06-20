package com.bean;

public class STDBean {
	
	private int id;
	String name;
	
	public STDBean(String name) {
		super();
		this.name = name;
	}

	public STDBean(int id) {
		super();
		this.id = id;
	}

	public STDBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		System.out.print("STD ID and NAME  :  ");
		return id+"   "+name;
		
	}

}
