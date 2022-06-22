package com.greatlearning.model;

public class Employee {
	
	//Declaring variables
	private String firstName;
	private String lastName;
	
	//Constructor (or special method/ function to assign name
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getters and Setters 
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
