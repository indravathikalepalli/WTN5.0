package com.wipro.mettl.day8;
/*digitSum even: sum of even digits in N*/
public class Ex2 {
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
