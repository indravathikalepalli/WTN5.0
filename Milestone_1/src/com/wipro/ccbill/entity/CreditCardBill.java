package com.wipro.ccbill.entity;

import java.util.Date;

import com.wipro.ccbill.exception.InputValidationException;

public class CreditCardBill {
	private String creditCardNo;
	private String customerId;
	private Date billDate;
	private Transaction monthTransactions[];
	double dbbill;
	double crbill;
	double outstanding;
	double interest_calculated;
	public CreditCardBill () {
		
	}
	public CreditCardBill(String creditCardNo, String customerId, Date billDate, Transaction[] monthTransactions) {
		this.creditCardNo = creditCardNo;
		this.customerId = customerId;
		this.billDate = billDate;
		this.monthTransactions = monthTransactions;
	}
	public double getTotalAmount(String transactionType) {
		double amount=0.0;
		if(transactionType.contentEquals("DB")||transactionType.contentEquals("CR")) {
		for(int i=0;i<monthTransactions.length;i++) {
			if(monthTransactions[i].getTransactionType().contentEquals(transactionType)) {
				amount+=monthTransactions[i].getTransactionAmount();
			}
		}
		return amount;
		}
		return 0;
	}
	public double calculateBillAmount() {
		String x="";
		try {
			x=validateData();
		}
		catch(InputValidationException e) {
			System.out.println(e.toString());
			return 0.0;
		}
		if(x.equals("valid")) {
			if(monthTransactions==null||monthTransactions.length<=0) {
				System.out.println("There are no transactions for the month");
				return 0.0;
			}
			else {
				dbbill=getTotalAmount("DB");
				crbill=getTotalAmount("CR");
				outstanding=Math.abs(dbbill-crbill);
				interest_calculated=outstanding*19.9/(12*100);
				return interest_calculated+outstanding;
			}
		}
		return 0;
	}
	public String validateData() throws InputValidationException{
		if(creditCardNo==null||creditCardNo.length()!=16) {
			throw new InputValidationException();
		}
		if(customerId==null||customerId.length()<6) {
			throw new InputValidationException();
		}
		return "valid";
	}
}
