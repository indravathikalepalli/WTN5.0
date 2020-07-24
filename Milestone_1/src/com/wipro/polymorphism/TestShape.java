package com.wipro.polymorphism;
class Shape{
	void draw(){
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
	void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Triangle");
	}
	@Override
	void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}
public class TestShape {
	public static void main(String[] args) {
		Shape s= new Shape();
		Shape c= new Circle();
		Shape t= new Triangle();
		Shape sq= new Square();
		s.draw();
		c.erase();
		t.draw();
		sq.draw();
	}
}
