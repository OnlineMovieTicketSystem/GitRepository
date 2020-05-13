package com.mtbs.exception;

public class ApplicationException extends RuntimeException{
//theatre and screen
	public ApplicationException(String string)
	{
		super(string);
		System.out.println(string);
	}

}
