package com.userregistration.validations;

import java.time.LocalDate;
import java.time.Period;

import com.userregistration.custom_exceptions.AgeLimitException;
import com.userregistration.custom_exceptions.UserRegistrationException;

public class RegistrationValidations {
	public static LocalDate validateAge(
			String dob)throws AgeLimitException{
		LocalDate date = LocalDate.parse(dob);
		int age = Period.between(date,LocalDate.now()).getYears();
		if(age<18) {
			throw new AgeLimitException("Age is below 18");	
		}
		return date;
	}
	public  static boolean validateUserName(String name,String password)throws UserRegistrationException{
		if(name.length()<6 || password.length()<6) {
			throw new UserRegistrationException("Username and Password must contain 6 characters");
		}
		return true;
	}
}
