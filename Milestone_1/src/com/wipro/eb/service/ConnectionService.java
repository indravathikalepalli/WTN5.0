package com.wipro.eb.service;

import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService {
	float [] cRate=new float[]{5.2f,6.8f,8.3f};
	float [] dRate=new float[]{2.3f,4.2f,5.5f};
	public boolean validate(int currentReading, int previousReading, String type)throws InvalidReadingException,InvalidConnectionException{
		if(currentReading<previousReading || currentReading<0 || previousReading<0) {
			throw new InvalidReadingException();
		}
		if(!type.equals("Commercial")&&!type.equals("Domestic")) {
			throw new InvalidConnectionException();
		}
		return true;
	}
	public float calculateBillAmt(int currentReading, int previousReading, String type) {
		 String x="";
		try {
			x=String.valueOf(validate(currentReading,previousReading,type));
		}
		catch(InvalidReadingException e) {
			x=e.toString();
		}
		catch(InvalidConnectionException e){
			x=e.toString();
		}
		if(x.equals("Incorrect Reading")) {
			return -1;
		}
		else if(x.equals("Invalid ConnectionType")) {
			return -2;
		}
		else {
			if(type.equals("Commercial")) {
				float [] slabs=cRate;
				Commercial c=new Commercial(currentReading,previousReading,slabs);
				return (c.computeBill());
			}
			else {
				float [] slabs=dRate;
				Domestic d= new Domestic(currentReading,previousReading,slabs);
				return (d.computeBill());
				}
		}
	}
	public String generateBill(int currentReading, int previousReading, String type) {
		float result=calculateBillAmt(currentReading,previousReading,type);
		if(result==-1) {
			return "Incorrect Reading";
		}
		else if(result==-2) {
			return "Invalid ConnectionType";
		}
		else {
			return ("Amount to be paid : "+result);
		}
	}


}
