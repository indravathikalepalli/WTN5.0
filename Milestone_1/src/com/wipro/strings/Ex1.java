package com.wipro.strings;

public class Ex1 {
public static void main(String[] args) {
	/*String h= "Hi heLO HoW ArE YoU";
	String h1="";
	for(int i=0;i<h.length();i++) {
		char c= h.charAt(i);
		if(Character.isLowerCase(c)) {
			h1+=Character.toUpperCase(c)+"";
		}
		else {
			h1+=Character.toLowerCase(c)+"";
		}
	}
	System.out.println(h1);*/
	String s= "a98dCH47L";
	String s1="";
	for(int i=0;i<s.length();i++) {
		char c= s.charAt(i);
		if(Character.isLetter(c)) {
			if(Character.isLowerCase(c)) {
				s1+=Character.toUpperCase(c)+"";
			}
			else {
				s1+=Character.toLowerCase(c)+"";
			}
		}
	}
	System.out.println(s1);
	StringBuilder a=new StringBuilder(s1);
	a.reverse();
	for(int i=0;i<a.length();i+=2) {
		System.out.print(a.charAt(i));
	}
	
}
}
