package com.wipro.WTN5;

public class P9 {
public static void main(String[] args) {
	int n= Integer.parseInt(args[0]);
	int d=Integer.parseInt(args[1]);
	int c=0;
	int t=n;
	while(n!=0) {
		int rem=n%10;
		if(rem==d) {
			c++;
		}
		n=n/10;
	}
	System.out.println(d+" occurs "+c+" times in "+t);
}
}
