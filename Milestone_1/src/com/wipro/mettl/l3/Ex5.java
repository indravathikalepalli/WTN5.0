package com.wipro.mettl.l3;
/*Find the one digit to be removed to form palindrome*/
public class Ex5 {
	String s=String.valueOf(input1);
	int val= Integer.parseInt(index(s));
	return val;
}
boolean isPalindrome(String s,int l,int h){
	while(l<h){
	if(s.charAt(l)!=s.charAt(h)){
		return false;
	}
		l++;
		h--;
	}
	return true;
}
String index(String s){
	int l=0,h=s.length()-1;
	while(l<h){
		if(s.charAt(l)==s.charAt(h)){
			l++;
			h--;
		}
		else{
			if(isPalindrome(s,l+1,h)){
				return s.charAt(l)+"";
			}
			if(isPalindrome(s,l,h-1)){
				return s.charAt(h)+"";
			}
		}
	}
	return "-1";
}
