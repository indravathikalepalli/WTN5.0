package com.wipro.classandobjects;

public class Calculator {
static int powerInt(int num1,int num2) {
	int r=(int)Math.pow((float)num1,(float)num2);
	return r;
}
static double powerDouble(double num1,int num2) {
	double r= Math.pow(num1,(double)num2);
	return r;
}
public static void main(String[] args) {
	System.out.println(Calculator.powerInt(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	System.out.println(Calculator.powerDouble(Double.parseDouble(args[2]),Integer.parseInt(args[3])));
}
}
