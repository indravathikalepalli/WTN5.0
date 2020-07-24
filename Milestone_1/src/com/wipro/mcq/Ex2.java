package com.wipro.mcq;
 class Demo{
	Demo(){
		System.out.println("parentclass");
	}
	Demo(String t){
		System.out.println(t);
	}
}
 public class Ex2 extends Demo {
Ex2(){
	//System.out.println("subclass");
}
/*Ex2(String t){
	//super(t);
	//super();
	System.out.println(t);
}*/
public static void main(String[] args) {
	Ex2 e= new Ex2();
	int s=25;
	Long a[]=new Long[s];
	for(long i=0;i<s;i++) {
		System.out.println(a[(long)i]);
	}
}
}
