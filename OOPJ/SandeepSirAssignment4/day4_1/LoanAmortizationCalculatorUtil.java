package com.java.day4_1;

import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {
	private Scanner sc = new Scanner(System.in);
    private LoanAmortizationCalculator lmc;

	public void acceptRecord() {
		System.out.println("Enter Principal Amount: ");
		double principal= sc.nextDouble();
		System.out.println("Enter Annual Interest Rate:");
		double annualInterestRate=sc.nextDouble();
		System.out.println("Enter Loan Term");
		int loanTerm=sc.nextInt();
		
		lmc=new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
		
	}
	
	public void printRecord() {
		if(lmc!=null) {
	    double monthlyPayment = lmc.calculateMonthlyPayment();
	    double totalPayment=lmc.calculateTotalPayment();
        System.out.printf("Monthly Payment: INR%.2f%n", monthlyPayment);
        System.out.printf("Total Payment over the life of the loan: INR%.2f%n", totalPayment);
		}
 }
	
	public void menuList() {
		while(true) {
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
