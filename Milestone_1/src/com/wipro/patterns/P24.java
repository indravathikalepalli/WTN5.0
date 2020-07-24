package com.wipro.patterns;

public class P24 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=n-i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
	}
}
