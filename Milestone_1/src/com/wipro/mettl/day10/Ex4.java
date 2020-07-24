package com.wipro.mettl.day10;
/*Most Frequent Digit*/
public class Ex4 {
	String s=Integer.toString(input1)+Integer.toString(input2)+Integer.toString(input3)+Integer.toString(input4);
	int a[]=new int[10];
	for(int i=0;i<s.length();i++){
		a[s.charAt(i)-'0']++;
	}
	int c=a[0];
	int d=0;
	for(int i=0;i<10;i++){
		if(c<=a[i]){
			c=a[i];
			d=i;
		}
	}
	return d;
}
