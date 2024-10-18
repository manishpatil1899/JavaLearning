package com.userregistration.operations;
import com.userregistration.core.User;
import com.userregistration.custom_exceptions.UserRegistrationException;


public class UserRegistrationImpl implements UserRegistration {
	private User[] users;// mem allocated in -heap
	private int counter;

	public UserRegistrationImpl(int size) {
		users = new User[size];
	}

	@Override
	public void registerUser(String dob,String username,String password) throws UserRegistrationException {
		users[counter++] = new User(dob,username,password);
		System.out.println( "Registration completed successfully for the user " + username);
	}
	@Override
	public void displayUserDetails() {
		System.out.println("All a/cs");
		for (User a : users)
			if (a != null)
				System.out.println(a);

	}
	
}
