package com.wipro.mcq;

 class Fruit {
Fruit getInstance() {
	return this;
}
void print() {
	System.out.println("Fruit");
}
}
 public class Ex1 extends Fruit{
	 Ex1 getInstance() {
		 return this;
	 }
	 void print() {
		 System.out.println("Apple");
	 }
	 public static void main(String[] args) {
		Fruit f= new Ex1().getInstance();
		f.print();
	}
 }
