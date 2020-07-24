package com.wipro.mettl.l3;
/*Find result after alternate add_sub on N*/
public class Ex2 {
	int s=input1;
	int k=1;
	if(input2==1){
		while(input1>0){
		input1-=1;
		if(k%2!=0){
			s-=input1;
		}
		else{
			s+=input1;
		}
		k++;
	}
	}
	else{
		while(input1>0){
		input1-=1;
		if(k%2!=0){
			s+=input1;
		}
		else{
			s-=input1;
		}
		k++;
	}
	}
	return s;
}
