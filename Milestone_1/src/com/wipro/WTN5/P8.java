package com.wipro.WTN5;

public class P8 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int t=n;
	int s=0;
	int l=(int)(Math.log10(n))+1;
	while(n!=0) {
		int rem=n%10;
		n=n/10;
		s=s+(int)Math.pow((float)rem,(float)l);
	}
	if(s==t) {
		System.out.println("The integer is armstrong");
	}
	else {
		System.out.println("The integer is not armstrong");
	}
}
}
