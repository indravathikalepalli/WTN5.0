package com.wipro.arrays;

public class Ex32 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=Integer.parseInt(args[i+1]);
	}
	int b[] = new int[n];
	int j=0;
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			b[j++]=a[i];
		}
	}
	for(int i=0;i<n;i++) {
		if(a[i]%2!=0) {
			b[j++]=a[i];
		}
	}
	for(int i=0;i<n;i++) {
		System.out.print(b[i]+" ");
	}
}
}
