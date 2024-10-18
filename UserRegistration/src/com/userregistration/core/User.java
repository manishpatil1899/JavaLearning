package com.userregistration.core;

public class User {
	private String dob;
	private String username;
	private String password;
	public User(String dob, String username, String password) {
		super();
		this.dob = dob;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [dob=" + dob + ", username=" + username + ", password=" + password + "]";
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
}

