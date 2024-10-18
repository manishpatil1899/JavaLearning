package com.userregistration.custom_exceptions;

public class AgeLimitException extends Exception{
	public AgeLimitException(String mesg) {
		super(mesg);
	}
}
