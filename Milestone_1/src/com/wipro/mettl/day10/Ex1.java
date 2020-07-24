package com.wipro.mettl.day10;
/*Return second word in Uppercase*/
public class Ex1 {
	String [] s= input1.split(" ");
	if(s.length<=1){
		return "LESS";
	}
	else{
		return s[1].toUpperCase();
	}
}
