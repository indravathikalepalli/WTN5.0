package com.wipro.flowcontrolstatement;

public class Ex17 {
public static void main(String[] args) {
	int f=0;
	if(args.length==0) {
		System.out.println("Please enter an integer number");
	}
	else {
		int n=Integer.parseInt(args[0]);
		if(n==0 ||n==1) {
			System.out.println(n+" is neither prime nor composite");
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					f=1;
					break;
				}
			}
			if(f==0) {
				System.out.println(n+" is a prime number");
			}
			else {
				System.out.println(n+" is not a prime number");
			}
		}
	}
}
}
