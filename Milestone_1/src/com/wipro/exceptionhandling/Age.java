package com.wipro.exceptionhandling;
class AgeException extends Exception{
	AgeException(String s){
		super(s);
	}
}
public class Age {
void ageCheck(int n) {
	try {
	if(n<18 ||n>60) {
		throw new AgeException("Age must be Greaterthan or equal to 18 and less than 60");
	}
	else {
		System.out.println("No error");
	}
	}
	catch(AgeException e) {
		System.out.println(e);
	}
}
public static void main(String[] args) {
	String name=args[0];
	int age=Integer.parseInt(args[1]);
	Age a= new Age();
	a.ageCheck(age);
}
}
