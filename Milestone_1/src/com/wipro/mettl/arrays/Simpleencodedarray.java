package com.wipro.mettl.arrays;
/*Simple Encoded Array*/
public class Simpleencodedarray {
	int a[] = new int[input2];
	   a[input2-1]=input1[input2-1];
	   int sum=a[input2-1];
	   for(int i=input2-2;i>=0;i--){
		   a[i]=input1[i]-a[i+1];
		   sum+=a[i];
	   }
		Result r =new Result(a[0],sum);
		return r;
}
