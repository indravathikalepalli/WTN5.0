package com.wipro.flowcontrolstatement;

public class Ex10 {
public static void main(String[] args) {
	char c=args[0].charAt(0);
	if(Character.isLowerCase(c)) {
		char b= Character.toUpperCase(c);
		System.out.println(c+"->"+b);
	}
	else {
		char b= Character.toLowerCase(c);
		System.out.println(c+"->"+b);
	}
}
}
