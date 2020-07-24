package com.wipro.mettl.day10;
/*weight of string*/
public class Ex3 {
	int s=0;
	if(input2==1){
		for(int i=0;i<input1.length();i++){
			char c = input1.charAt(i);
			 c=Character.toLowerCase(c);
			 if(Character.isLetter(c)){
			s=s+(c-'a')+1;
			 }
		}
	}
	else{
		for(int i=0;i<input1.length();i++){
			char c= input1.charAt(i);
			 c=Character.toLowerCase(c);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u'&&Character.isLetter(c)){
			s=s+(c-'a')+1;
			System.out.println(s);
			}
		}
	}
	return s;
}
