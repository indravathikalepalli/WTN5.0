package com.wipro.mettl.day5;
/*Of 5 numbers, how many are even or odd? */
public class E4 {
	int c=0;
	if(input1%2==0){
			c++;
		}
	if(input2%2==0){
			c++;
		}
	if(input3%2==0){
			c++;
		}
	if(input4%2==0){
			c++;
		}
	if(input5%2==0){
			c++;
		}
	if(input6.equals("even")){
		return c;
	}
	else{
		return 5-c;
	}
}
