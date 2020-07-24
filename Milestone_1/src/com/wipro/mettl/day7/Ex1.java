package com.wipro.mettl.day7;
/*Number of Primes in a specified range*/
public class Ex1 {
	int c=0;
	for(int i=input1;i<=input2;i++){
		int f=0;
		for(int j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
				f=1;
				break;
			}
		}
		if(f==0){
			c++;
		}
	}
	return c;
}
