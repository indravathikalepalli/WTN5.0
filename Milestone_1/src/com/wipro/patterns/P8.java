package com.wipro.patterns;

public class P8 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
