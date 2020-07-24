package com.wipro.mettl.day9;
/*Create PIN using alpha, beta, gamma*/
public class Ex3 {
	String s="";
	int sum=0;
	int ma=0;
	while(input1>0&&input2>0&&input3>0){
		int rem1=input1%10;
		int rem2=input2%10;
		int rem3=input3%10;
		int m=Math.min(rem1,Math.min(rem2,rem3));
		int m1=Math.max(rem1,Math.max(rem2,rem3));
		s=s+m;
		if(ma<m1){
			ma=m1;
		}
		input1/=10;
		input2/=10;
		input3/=10;
	}
	s=s+ma;
	StringBuffer s1=new StringBuffer(s);
	 s=s1.reverse().toString();
	return Integer.parseInt(s);
}
