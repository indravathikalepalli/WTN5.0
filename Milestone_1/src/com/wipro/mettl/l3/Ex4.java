package com.wipro.mettl.l3;
/*Calculate sum of non-prime index values*/
public class Ex4 {
	int sum=0;
	for(int i=0;i<input2;i++){
		if(i==0||i==1){
			sum+=input1[i];
		}
		else{
		for(int j=2;j<=Math.sqrt(i);j++){
			if(i%j==0){
				sum+=input1[i];
				break;
			}
		}
		}
	}
		return sum;
}
