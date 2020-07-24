package com.wipro.mettl.strings;

public class NumbiarNumber {
	String f="";
	int i=0;
	while(i<input1.length()){
		int sum=0;
		if((input1.charAt(i)-'0')%2==0){
			for(int j=i;j<input1.length();j++){
				sum=sum+(input1.charAt(j)-'0');
				if(sum%2!=0){
					i=j+1;
					f=f+String.valueOf(sum);
					break;
				}
				else if(j==input1.length()-1){
					f=f+String.valueOf(sum);
					i=j+1;
					break;
				}
			}
		}
		else{
			for(int j=i;j<input1.length();j++){
				sum=sum+(input1.charAt(j)-'0');
				if(sum%2==0){
					i=j+1;
					f=f+String.valueOf(sum);
					break;
				}
				else if(j==input1.length()-1){
					f=f+String.valueOf(sum);
					i=j+1;
					break;
				}
			}
		}
		
	}
	int o=Integer.valueOf(f);
	return o;
}
