package com.wipro.mettl.day8;
/*digitSum opt: sum of even or odd digits*/
public class Ex4 {
	if(input2.equals("even")){
		int c=0;
		while(input1>0){
			int rem=input1%10;
			if(rem%2==0){
				c+=rem;
			}
			input1/=10;
		}
		return c;
	}
	else{
		int c=0;
		while(input1>0){
			int rem=input1%10;
			if(rem%2!=0){
				c+=rem;
			}
			input1/=10;
		}
		return c;
	}
}
