package com.wipro.mettl.day7;
/*Non-Repeated Digits’ Count */
public class Ex4 {
	int c=0;
	int [] a= new int[10];
	while(input1>0){
		int rem=input1%10;
		input1/=10;
		a[rem]++;
	}
	for(int i=0;i<10;i++){
		if(a[i]==1){
			c++;
		}
	}
	return c;
}
