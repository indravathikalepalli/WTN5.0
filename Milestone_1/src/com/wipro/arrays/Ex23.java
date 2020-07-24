package com.wipro.arrays;

public class Ex23 {
public static void main(String[] args) {
	int [] a= {2,4,6,8,5};
	int sum=0,avg;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	avg=sum/(a.length);
	System.out.println("Sum is "+sum+" and Average is "+avg);
}
}
