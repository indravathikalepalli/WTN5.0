package com.wipro.mettl.strings;

public class Identifypossiblewords {
	input2=input2.toUpperCase();
	input1=input1.toUpperCase();
	String [] s=input2.split(":");
	String output="";
	for(int i=0;i<s.length;i++){
		int f=0;
		String h=s[i];
		if(input1.length()==h.length()){
			for(int j=0;j<input1.length();j++){
				if(input1.charAt(j)!='_'&&input1.charAt(j)!=h.charAt(j)){
					f=1;
					break;
				}
			}
		}
		else{
			f=1;
		}
		if(f==0){
			if(output.length()>0){
				output=output+":"+h;
			}
			else{
				output=h;
			}
		}
	}
	if(output.length()>0){
	return output;
	}
	else{
		return "ERROR-009";
	}
}
