package com.matt;

public class Student {
	private Address address;
	
	public Student(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void showInfo() {
		System.out.println("Student address is "+address.getAddress());
	}
}
