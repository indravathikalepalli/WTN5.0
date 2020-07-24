package com.wipro.polymorphism;
class Fruit{
	int size;
	String taste,name;
	Fruit(String name,String taste,int size) {
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat() {
		System.out.println("Name is :"+name);
		System.out.println("Taste is :"+taste);
		System.out.println("Size is :"+size);
	}
}
class Orange extends Fruit{
	Orange(String name,String taste,int size){
		super(name,taste,size);
	}
	@Override
	void eat() {
		System.out.println("Name is :"+name);
		System.out.println("Taste is :"+taste);
		System.out.println("Size is :"+size);
	}
}
class Apple extends Fruit{

	Apple(String name, String taste, int size) {
		super(name, taste, size);
		// TODO Auto-generated constructor stub
	}
	void eat() {
		System.out.println("Name is :"+name);
		System.out.println("Taste is :"+taste);
		System.out.println("Size is :"+size);
	}
}
public class TestFruit {
	public static void main(String[] args) {
	Fruit f= new Fruit("Grapes","Sour",4);
	Fruit o =new Orange("Orange","Sour",5);
	Apple a = new Apple("Apple","Sweet",10);
	o.eat();
	a.eat();
}}
	
