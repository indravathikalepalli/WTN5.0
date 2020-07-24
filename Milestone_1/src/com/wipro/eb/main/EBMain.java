package com.wipro.eb.main;
import com.wipro.eb.service.ConnectionService;
import java.util.*;
public class EBMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Current Reading : ");
		int currentReading=sc.nextInt();
		System.out.println("Previous Reading : ");
		int previousReading=sc.nextInt();
		System.out.println("Type : ");
		String type= sc.next();
		System.out.println(new ConnectionService().generateBill(currentReading, previousReading, type));
	}

	}

