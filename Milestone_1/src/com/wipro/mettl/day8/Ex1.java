package com.wipro.mettl.day8;
/*digitSum : sum of all digits in N*/
public class Ex1 {
	boolean f=true;
	int sum=0;
	while(f){
		while(Math.abs(input1)>0){
			int rem=input1%10;
			sum+=rem;
			input1/=10;
		}
		if(sum>-10&&sum<10){
			return sum;
		}
		else{
			input1=sum;
			sum=0;
		}
	}
	return sum;
}
