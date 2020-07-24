package com.wipro.flowcontrolstatement;

public class Ex20 {
public static void main(String[] args) {
	char[] n= args[0].toCharArray();
	for(int i=n.length-1;i>=0;i--) {
		System.out.print(n[i]);
	}
}
}
