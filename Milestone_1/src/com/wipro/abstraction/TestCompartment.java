package com.wipro.abstraction;

import java.util.Random;

public class TestCompartment {
public static void main(String[] args) {
	Compartment[] c= new Compartment[10];
	Random r=new Random();
	for(int i=0;i<10;i++) {
		int rand=r.nextInt(4)+1;
		if(rand==1) {
			c[i]=new FirstClass();
		}
		else if(rand==2) {
			c[i]=new Ladies();
		}
		else if(rand==3) {
			c[i]=new General();
		}
		else {
			c[i]=new Luggage();
		}
		c[i].notice();
	}
}
}
