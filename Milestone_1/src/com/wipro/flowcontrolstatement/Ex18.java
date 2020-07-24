package com.wipro.flowcontrolstatement;

public class Ex18 {
public static void main(String[] args) {
	int n= Integer.parseInt(args[0]);
	int sum=0,rem;
	while(n!=0) {
		rem=n%10;
		n=n/10;
		sum=sum+rem;
	}
	System.out.println(sum);
}
}
