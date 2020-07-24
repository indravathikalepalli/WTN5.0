package com.wipro.flowcontrolstatement;
public class Ex15 {
public static void main(String[] args) {
	int f=0;
	int n= Integer.parseInt(args[0]);
	if(n==2 ||n==3) {
		System.out.println("Prime");
	}
	else {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				f=1;
				break;
			}
		}
		if(f==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
}
