package com.wipro.exceptionhandling;

public class MathOperation {
	public static void main(String[] args) throws ArithmeticException,NumberFormatException {
		int n= args.length;
		int [] a= new int[n];
		int sum=0,avg=0;
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(args[i]);
			sum+=a[i];
		}
		avg=sum/n;
		System.out.println("Sum is "+sum+" and average is "+avg);
	}
}
