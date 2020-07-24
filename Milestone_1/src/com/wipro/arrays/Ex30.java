package com.wipro.arrays;

public class Ex30 {
	public static int findIndex(int a[],int i) {
		int index=0;
		for(int j=i;j<a.length;j++) {
			if(a[j]==7) {
				index=j;
				return index;
			}
		}
		return (i-1);
	}
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=Integer.parseInt(args[i+1]);
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		if(a[i]==6) {
			int in=findIndex(a,i+1);
			if(in==i) {
				sum=sum+a[i];
			}
			else {
				i=in;
			}
		}
		else {
			sum=sum+a[i];
		}
	}
	System.out.println(sum);
}
}
