package com.wipro.mettl.strings;

public class Encodedthreestrings {
	String [] s=new String[]{input1,input2,input3};
	String o1="";
	String o2="";
	String o3="";
	for(int i=0;i<s.length;i++){
		int n=s[i].length()/3;
    if(s[i].length()%3==1){
			o1+=s[i].substring(0,(s[i].length()/3));
			o2+=s[i].substring((s[i].length()/3),(2*n)+1);
			o3+=s[i].substring((2*n)+1,s[i].length());
		}
		else if(s[i].length()%3==2){
			o1+=s[i].substring(0,(s[i].length()/3)+1);
			o2+=s[i].substring((s[i].length()/3)+1,(2*n)+1);
			o3+=s[i].substring((2*n)+1,s[i].length());
		}
	else if(s[i].length()%3==0){
		o1+=s[i].substring(0,(s[i].length()/3));
		o2+=s[i].substring((s[i].length()/3),s[i].length()-s[i].length()/3);
		o3+=s[i].substring(s[i].length()-s[i].length()/3,s[i].length());
	}
	}
	String o4="";
	for(int i=0;i<o3.length();i++){
		if(Character.isLowerCase(o3.charAt(i))){
			o4+=Character.toUpperCase(o3.charAt(i));
		}
		else{
			o4+=Character.toLowerCase(o3.charAt(i));
		}
	}
	Result r= new Result(o1,o2,o4);
	return r;
}
