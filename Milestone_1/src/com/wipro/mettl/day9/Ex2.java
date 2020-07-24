package com.wipro.mettl.day9;
/*Is Palindrome Possible?*/
public class Ex2 {
	int [] a=new int[10];
	while(input1>0){
		int rem=input1%10;
		a[rem]++;
		input1/=10;
	}
	int to=0,t=0,o=0;
	for(int i=0;i<10;i++){
		if(a[i]>0){
			to++;
			if(a[i]%2==0){
				t++;
			}
			else{
				o++;
			}
		}
	}
	if(o<=1){
		return 2;
	}
	else{
		return 1;
	}
}
