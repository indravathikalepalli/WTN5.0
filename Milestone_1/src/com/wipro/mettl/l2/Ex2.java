package com.wipro.mettl.l2;
/*Sum of Sums of Digits in Cyclic order*/
public class Ex2 {
	int sum=0;
	int input2=0;
	while(input1>0){
		int rem=input1%10;
		input2=input2*10+rem;
		input1/=10;
	}
	while(input2>0){
		int s=0;
		int input=input2;
		while(input>0){
		int rem=input%10;
		s+=rem;
		input/=10;
	}
	sum+=s;
	input2/=10;
}
return sum;
}
