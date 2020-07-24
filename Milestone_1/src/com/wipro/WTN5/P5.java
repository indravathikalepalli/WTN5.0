package com.wipro.WTN5;

public class P5 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int c=0;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			c+=rem;
		}
		System.out.println("The sum of digits is "+c);
	}
}
