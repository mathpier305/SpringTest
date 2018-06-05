package com.matt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	private Address address;
	
	public Student() {
	}
	
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
