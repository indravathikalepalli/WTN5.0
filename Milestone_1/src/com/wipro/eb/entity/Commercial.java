package com.wipro.eb.entity;

public class Commercial extends Connection {
	float amount_payable;
	public Commercial(int previousReading, int currentReading, float[] slabs) {
		super(previousReading, currentReading, slabs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float computeBill() {
		// TODO Auto-generated method stub
		if(currentReading<=50) {
			amount_payable=(currentReading*slabs[0]);
		}
		else if(currentReading>50 && currentReading<=100) {
			amount_payable=(50*slabs[0]+(currentReading-50)*slabs[1]);
		}
		else {
			amount_payable=(50*slabs[0]+50*slabs[1]+(currentReading-100)*slabs[2]);
		}
		if(amount_payable<5000) {
			amount_payable+=amount_payable*0.02;
		}
		else if(amount_payable>=5000 && amount_payable<10000) {
			amount_payable+=amount_payable*0.06;
		}
		else {
			amount_payable+=amount_payable*0.09;
		}
		return amount_payable;
	}

}
