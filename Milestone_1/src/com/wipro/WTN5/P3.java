package com.wipro.WTN5;

public class P3 {
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int sum=0,sum1=0;
		for(int i=1;i<=n;i++) {
			sum+=i*i*i;
		}
		sum1=((n*(n+1))/2)*((n*(n+1))/2);
		System.out.println("Sum by using loops is "+sum);
		System.out.println("Sum by using formula is "+sum1);
	}
}
