package com.wipro.mettl.strings;

public class Getcodethroughstrings {
	String [] s=input1.split(" ");
	int sum=0;
	for(int i=0;i<s.length;i++){
		String h=s[i];
		sum+=h.length();
	}
	return sum%9==0?9:sum%9;
}
