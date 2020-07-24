package com.wipro.mettl.strings;

public class UserIdgenertion {
	String pin=String.valueOf(input3);
	String s="";
	int N=input4;
	if(input1.length()<input2.length()){
		s=s+input1.charAt(input1.length()-1);
		s=s+input2;
		s=s+pin.charAt(N-1);
		s=s+pin.charAt(pin.length()-N);
	}
	else if(input2.length()<input1.length()){
		s=s+input2.charAt(input2.length()-1);
		s=s+input1;
		s=s+pin.charAt(N-1);
		s=s+pin.charAt(pin.length()-N);
	}
	else{
		String ss=(input1.compareTo(input2)<0)?input1:input2;
		String ls=(input2.compareTo(input1)>0)?input2:input1;
		s=s+ss.charAt(ss.length()-1);
		s=s+ls;
		s=s+pin.charAt(N-1);
		s=s+pin.charAt(pin.length()-N);
	}
	String output="";
	for(int i=0;i<s.length();i++){
	
		if(Character.isLowerCase(s.charAt(i))){
			output+=Character.toUpperCase(s.charAt(i));
		}
		else{
			output+=Character.toLowerCase(s.charAt(i));
		}
		
	}
	return output;
}
