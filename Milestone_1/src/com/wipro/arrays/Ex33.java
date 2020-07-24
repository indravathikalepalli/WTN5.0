package com.wipro.arrays;

public class Ex33 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int [] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(args[i+1]);
		}
		int f=0;
		for(int i=0;i<n;i++) {
			if(a[i]!=1 && a[i]!=4) {
				f=1;
				break;
			}
		}
		if(f==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
}
}
