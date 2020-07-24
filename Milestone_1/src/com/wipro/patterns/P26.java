package com.wipro.patterns;

public class P26 {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<n;i++) {
			int k=i+1;
			for(int j=n-i;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<n-i;j++) {
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
}
