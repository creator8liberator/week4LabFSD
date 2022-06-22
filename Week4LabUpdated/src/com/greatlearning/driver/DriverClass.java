package com.greatlearning.driver;
import java.util.Scanner;
import com.greatlearning.model.Employee; // Because class Employee is used
import com.greatlearning.service.CredentialService; // Because class Employee is used

public class DriverClass {
	
	// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee ("Saagar", "Sachdev"); //Object for Employee class where the name of the employee if hard-coded
		
		CredentialService cService = new CredentialService(); //Object for Credential Service class
		
		//Variable declaration
		String generatedEmail;
		char[] generatedPassword;
		Scanner scan = new Scanner(System.in); // Uses the Scanner default class
		
		// Will be displayed to the user
		System.out.println("Hi, welcome to the Email Generator");
		System.out.println("1. Technical");
		System.out.println("2. Administration");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		// Prompts user to enter their choice
		int whatsYourChoice;
		System.out.println("Enter numbers between 1 - 4");
		
		// takes the user's choice
		whatsYourChoice = scan.nextInt();
		
		// ifs and else-ifs for 4 choices
		if (whatsYourChoice == 1)
			
		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(),"Technical");
			
			generatedPassword = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPassword);
			
		}
		
		else if (whatsYourChoice == 2)
			
		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(),"Administration");
			
			generatedPassword = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPassword);
			
		}
		
		else if (whatsYourChoice == 3)
			
		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(),"Human Resources");
			
			generatedPassword = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPassword);
			
		}
		
		else if (whatsYourChoice == 4)
			
		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(), 
					employee.getLastName().toLowerCase(),"Legal");
			
			generatedPassword = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPassword);
			
		}

	}

}
