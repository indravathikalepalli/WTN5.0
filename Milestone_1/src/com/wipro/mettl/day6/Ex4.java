package com.wipro.mettl.day6;
/*nth prime*/
import java.util.Scanner;

public class Ex4 {
	int c=0;
	int n=1;
	while(c<input1) {
		int f=0;
		n+=1;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				f=1;
				break;
			}
		}
		if(f==0) {
			c++;
		}
	}
	return n;
}
}
