package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.model.Employee;


public class CredentialService {
	
	public char[] generatePassword()
		{	
		
		
			String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
			String numerals = "0123456789";
			String specialCharacters = "@#$%^&*";
		
			String allPossibleChoices = upperCaseLetters + lowerCaseLetters + numerals + specialCharacters;
			
		
			Random random = new Random();
		
			char[] password = new char[8];
		
			for (int i=0; i<8; i++)
				{	
					int randomIndex = random.nextInt(allPossibleChoices.length());
					password[i] = allPossibleChoices.charAt(randomIndex);
					
					//password[i] = allPossibleChoices.charAt(random.nextInt(allPossibleChoices.length()));
				
				}
				
			return password;
		
		}


	public String generateEmail(String firstName, String lastName, String department)
	{
	String email = firstName + "." + lastName + "@" + department.toLowerCase() + ".greatlearning.com";
	return email;
	
	}

	public void displayCredentials(Employee employee, String generatedEmail, char[] generatePassword)
	{
	System.out.println("Hi "+employee.getFirstName());
	System.out.println("Your eMail is "+generatedEmail);
	System.out.println("Your password is "+generatePassword);
	}
	
}



