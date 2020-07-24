package com.wipro.arrays;

public class Ex29 {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int [] a=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=Integer.parseInt(args[i+1]);
	}
	int b[]=new int[n];
	int j=0;
	b[j]=a[0];
	for(int i=1;i<n;i++) {
		int f=0;
		for(int z=0;z<=j;z++) {
			if(a[i]==b[z]) {
				f=1;
				break;
			}
		}
		if(f==0) {
			b[++j]=a[i];
		}
	}
	for(int i=0;i<=j;i++) {
		System.out.print(b[i]+" ");
	}
}
}
