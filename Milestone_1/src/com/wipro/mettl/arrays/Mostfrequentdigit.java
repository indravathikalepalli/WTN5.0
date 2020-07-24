package com.wipro.mettl.arrays;

public class Mostfrequentdigit {
	String s="";
	for(int i=0;i<input2;i++){
		s=s+String.valueOf(input1[i]);
	}
	int a[]=new int[10];
	for(int i=0;i<s.length();i++){
		char c= s.charAt(i);
		a[c-'0']++;
	}
	int c=0;
	int f=0;
	for(int i=0;i<10;i++){
		if(c<=a[i]){
			c=a[i];
			f=i;
		}
	}
	return f;
}
