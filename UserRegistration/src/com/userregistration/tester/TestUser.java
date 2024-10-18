package com.userregistration.tester;

import java.util.Scanner;

import com.userregistration.operations.*;

public class TestUser {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Enter max no of users");
			boolean exit=false;
			UserRegistration usr = new UserRegistrationImpl(sc.nextInt());
			while(!exit) {
				System.out.println("1.Register user\n2.Display All Users");
				System.out.println("Enter choice!");
				try {
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter dob,username,password");
						usr.registerUser(sc.next(), sc.next(), sc.next());
						sc.nextLine();
						break;
					case 2:
						usr.displayUserDetails();
						break;
					default:
						System.out.println("Exited");
						exit=true;
						break;
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}

	}

}
