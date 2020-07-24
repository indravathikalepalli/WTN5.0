package com.wipro.arrays;

public class Ex36 {
public static void main(String[] args) {
	int a[][]=new int[3][3];
	int k=0;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			a[i][j]=Integer.parseInt(args[k++]);
		}
	}
	int maxi=a[0][0];
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(a[i][j]+" ");
			if(maxi<a[i][j]) {
				maxi=a[i][j];
			}
		}
		System.out.println();
	}
	System.out.println("The biggest number in the given array is "+maxi);
}
}
