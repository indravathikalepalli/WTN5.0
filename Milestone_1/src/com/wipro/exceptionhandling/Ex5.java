package com.wipro.exceptionhandling;

import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) throws ArithmeticException {
	try {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.println("The result is :" +a/b);
	}
	catch(ArithmeticException e){
		System.out.println(e);
	}
}
}
