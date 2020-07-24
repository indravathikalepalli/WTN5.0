package com.wipro.mettl.day10;
/*is Palindrome (string) */
public class Ex2 {
	StringBuffer input=new StringBuffer(input1.toLowerCase());
	input=input.reverse();
	if(input.toString().equals(input1.toLowerCase())){
		return 2;
	}
	else{
		return 1;
	}
}
