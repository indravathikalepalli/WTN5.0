package com.wipro.arrays;

import java.util.Arrays;

public class Ex27 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=Integer.parseInt(args[i+1]);
	}
	Arrays.sort(a);
	System.out.println("the smallest two numbers are "+a[0]+" "+a[1]);
	System.out.println("the largest two numbers are "+a[n-2]+" "+a[n-1]);
	
}
}
