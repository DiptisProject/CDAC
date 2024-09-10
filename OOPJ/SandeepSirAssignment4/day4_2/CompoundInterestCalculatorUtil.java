package com.java.day4_2;

import java.util.Scanner;

public class CompoundInterestCalculatorUtil {
	
	private Scanner sc = new Scanner(System.in);
	private CompoundInterestCalculator cic;
	
	public void acceptRecord() {
		System.out.println("Initial Investment Amount:");
		double principal=sc.nextDouble();
		System.out.println("Annual Interest Rate:");
		double annualInterestRate=sc.nextDouble();
		System.out.println("Number of times the interest is compounded per year");
		int numberOfCompound=sc.nextInt();
		System.out.println("Investment Duration:");
		int year=sc.nextInt();
		
		cic=new CompoundInterestCalculator(principal, annualInterestRate, numberOfCompound, year);	
	}
	
	public void printRecord() {
		if(cic!=null)
		{
			double futureValue=cic.calculateFutureValue();
			double totalInterest=cic.calculateTotalInterest();
	        System.out.printf("Future Value: INR %.2f%n", futureValue);
		    System.out.printf("Total Interest Earned: INR %.2f%n", totalInterest);
			
		}	
	}
		
		public void menuList() {
			while(true) {
		    System.out.println(".....MenuList.....");
			System.out.println("1. Accept Record:");
			System.out.println("2. Print Record:");
			System.out.println("3. Exit");
			System.out.println("Enter Choice");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
				    acceptRecord();
				    break;
			case 2 :
				    printRecord();
				    break;
		   default:
			      System.out.println("Invalid");
			 }
			
			}
	}
}
