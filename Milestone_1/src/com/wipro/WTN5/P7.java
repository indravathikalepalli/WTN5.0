package com.wipro.WTN5;

public class P7 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int t=n;
		int c=0;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			c=c*10+rem;
		}
		if(c==t) {
		System.out.println("The integer is palindrome ");
		}
		else {
			System.out.println("The integer is not palindrome ");
		}
	}
}
