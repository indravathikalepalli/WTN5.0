package com.wipro.flowcontrolstatement;

public class Ex21 {
public static void main(String[] args) {
int n= Integer.parseInt(args[0]);
int m=n;
int rev=0;
while(n!=0) {
	int rem=n%10;
	n=n/10;
	rev=rev*10+rem;
}
if(m==rev) {
	System.out.println(m+" is a palindrome");
}
else {
	System.out.println(m+" is not a palindrome");
}
}
}
