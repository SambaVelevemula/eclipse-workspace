package com.emp;

import com.address.Address;

public class Emp {
	
	private int id;
	private String name;
	private Address address;
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println ("EMP_ID      EMP_NAME    EMP_ADDRESS");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.print(id+"          "+name+"        "+address);
	}
}
