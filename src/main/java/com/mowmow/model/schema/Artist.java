package com.mowmow.model.schema;

import org.springframework.data.annotation.Id;

public class Artist {

	@Id
	private String identifier;

	public String firstName;
	public String lastName;
	

	public Artist(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Artist [identifier=" + identifier + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
