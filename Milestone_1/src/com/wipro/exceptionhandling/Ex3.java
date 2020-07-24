package com.wipro.exceptionhandling;
class MyException extends Exception{
	String s;
	public MyException(String s) {
		this.s=s;
	}
	public String toString() {
		return ("MyException occurred :"+this.s);
	}
}
public class Ex3 {
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=2;i++) {
			String name="";
			int [] a=new int[3];
			int sum=0,avg=0;
			try {
			name=args[k++];
			for(int j=0;j<3;j++) {
				a[i]=Integer.parseInt(args[k++]);
				if(a[i]<0) {
					throw new MyException("Value is negative");
				}
				if(a[i]>100) {
					throw new MyException("Value out of range");
				}
				sum+=a[i];
			}
			avg=sum/3;
			System.out.println("Average score of "+name+" is "+avg);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
}
