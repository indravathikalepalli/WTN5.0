package com.wipro.patterns;

public class P17 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			for(int j=n-i-1;j<n;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
}