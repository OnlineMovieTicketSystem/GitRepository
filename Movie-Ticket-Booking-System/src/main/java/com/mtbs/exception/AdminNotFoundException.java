package com.mtbs.exception;

public class AdminNotFoundException extends Exception{
public AdminNotFoundException(String message) {
	System.out.println("Exception:"+message);
}
}
