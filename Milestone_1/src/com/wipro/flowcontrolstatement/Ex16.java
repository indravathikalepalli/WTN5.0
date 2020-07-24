package com.wipro.flowcontrolstatement;
public class Ex16 {
public static void main(String[] args) {
	for(int i=10;i<=99;i++) {
		if(isPrime(i)) {
			System.out.println(i);
		}
	}
}
public static boolean isPrime(int n) {
	if(n<=1) {
		return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
}
}
