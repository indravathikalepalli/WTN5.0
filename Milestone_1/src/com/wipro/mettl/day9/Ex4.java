package com.wipro.mettl.day9;
/*Weight of a hill pattern */
public class Ex4 {
	int s=0;
	for(int i=1;i<=input1;i++){
		for(int j=1;j<=i;j++){
			s+=input2;
		}
		input2+=input3;
	}
	return s;
}
