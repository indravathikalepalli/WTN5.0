package com.wipro.patterns;

public class P4 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n-i+" ");
			}
			System.out.println();
		}
	}
}
