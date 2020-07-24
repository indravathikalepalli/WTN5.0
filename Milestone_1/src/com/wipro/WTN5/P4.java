package com.wipro.WTN5;

public class P4 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int c=0;
	while(n!=0) {
		n=n/10;
		c++;
	}
	System.out.println("The count of digits is "+c);
}
}
