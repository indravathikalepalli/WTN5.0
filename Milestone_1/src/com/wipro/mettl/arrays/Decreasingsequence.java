package com.wipro.mettl.arrays;

public class Decreasingsequence {
	int a[]=new int[input2];
	   /*for(int i=0;i<input2;i++){
		   a[i]=1;
	   }*/
	   for(int i=1;i<input2;i++){
		   if(input1[i]<input1[i-1]){
			   if(a[i-1]==0){
			   a[i]=a[i-1]+1;
			   }
			   else{
				   a[i]=a[i-1]+1;
				   a[i-1]=0;
			   }
		   }
	   }
	   int c=0;
	   for(int i=0;i<input2;i++){
		   if(a[i]>0){
			   c++;
		   }
	   }
	   if(c==0){
		  Result r= new Result(0,0);
	   return r; 
	   }
	   Arrays.sort(a);
	   int m=a[input2-1];
	   Result r= new Result(c,m+1);
	   return r;
}
