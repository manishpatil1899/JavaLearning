package com.userregistration.operations;

import com.userregistration.custom_exceptions.UserRegistrationException;

public interface UserRegistration {
	//add a method to open new bank a/c
	void registerUser (String dob, String username,String password) throws UserRegistrationException ;
	//add a method to display info of all a/cs
	void displayUserDetails();	
}
