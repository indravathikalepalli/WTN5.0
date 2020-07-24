package com.wipro.classandobjects;

public class Box {
	float width,height,depth;
Box(float w,float h, float d){
	this.width=w;
	this.height=h;
	this.depth=d;
}
float volume() {
	return (width*height*depth);
}
public static void main(String[] args) {
	float w=Float.parseFloat(args[0]);
	float h=Float.parseFloat(args[1]);
	float d=Float.parseFloat(args[2]);
	Box b= new Box(w,h,d);
	System.out.println("The volume of box is :"+b.volume());
}
}
