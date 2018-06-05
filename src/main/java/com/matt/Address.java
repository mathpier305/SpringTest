package com.matt;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	
	private String address;
	
	public Address() {
		address = "Address is the address ";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
