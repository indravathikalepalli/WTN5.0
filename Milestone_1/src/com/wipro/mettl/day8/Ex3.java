package com.wipro.mettl.day8;
/*digitSum odd: sum of odd digits in N*/
public class Ex3 {
	int c=0;
	while(input1>0){
		int rem= input1%10;
		if(rem%2==1){
			c+=rem;
		}
		input1/=10;
	}
	return c;
}
