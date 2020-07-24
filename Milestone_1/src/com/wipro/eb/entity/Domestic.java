package com.wipro.eb.entity;

public class Domestic extends Connection {
	float amount_payable;
	public Domestic(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}
	public float computeBill() {
		if(currentReading<=50) {
			amount_payable=(currentReading * slabs[0]);
		}
		else if(currentReading>50 && currentReading<=100) {
			amount_payable= (50*slabs[0]+(currentReading-50)*slabs[1]);
		}
		else {
			amount_payable= (50*slabs[0]+50*slabs[1]+(currentReading-100)*slabs[2]);
		}
		return amount_payable;
		
	}
}
