package com.wipro.exceptionhandling;
class InvalidCountryException extends Exception{
	InvalidCountryException(String s){
		super(s);
	}
}
public class UserRegistration {
	String username,usercountry;
	void registerUser(String username,String usercountry) {
		this.username=username;
		this.usercountry=usercountry;
		try {
			if(usercountry.equals("India")) {
				System.out.println("User registration done successfully");
			}
			else {
				throw new InvalidCountryException("User Outside India cannot be registered");
			}
		}
		catch(InvalidCountryException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		UserRegistration u=new UserRegistration();
		u.registerUser(args[0], args[1]);
	}
}
