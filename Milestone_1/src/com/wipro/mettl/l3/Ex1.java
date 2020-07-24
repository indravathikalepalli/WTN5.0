package com.wipro.mettl.l3;
/*Generate series and find Nth element*/
public class Ex1 {
	int [] a= new int[input4];
	a[0]=input1;
	a[1]=input2;
	a[2]=input3;
	if(input4<=3){
		return a[input4-1];
	}
	else{
		for(int i=3;i<input4;i++){
			a[i]=a[i-2]-a[i-3]+a[i-1];
		}
	}
	return a[input4-1];

}
