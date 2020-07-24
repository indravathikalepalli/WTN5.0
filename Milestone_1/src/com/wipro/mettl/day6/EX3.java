package com.wipro.mettl.day6;
/*Nth Fibonacci*/
public class EX3 {
	int [] a= new int[input1];
	if(input1==1){
		return 0;
	}
	else if(input1==2){
		return 1;
	}
	else{
	a[0]=0;
	a[1]=1;
	for(int i=2;i<input1;i++){
		a[i]=a[i-1]+a[i-2];
	}
	return a[input1-1];
}

}
