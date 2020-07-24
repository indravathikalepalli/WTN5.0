package com.wipro.mettl.day6;
/*Is Prime?*/
public class Ex1 {
	if(input1==1){
		return 1;
	}
	else if(input1==2||input1==3){
		return 2;
	}
	else{
		for(int i=2;i<=Math.sqrt(input1);i++){
			if(input1%i==0){
				return 1;
			}
		}
		return 2;

}
