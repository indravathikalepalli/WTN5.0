package com.wipro.mettl.day7;
/*Unique Digits Count*/
public class Ex3 {
	int [] a=new int[10];
	int c=0;
while(input1>0){
    int rem=input1%10;
    input1/=10;
    a[rem]=1;
}
for(int i=0;i<10;i++){
	if(a[i]==1){
		c++;
	}
}
return c;
}
