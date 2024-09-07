package Day3;

import java.util.Scanner;

public class LoanAmortizationCalculator {
    
	private double principal;
	private double annualInterestRate;
	private int loanTerm;
	
	public void acceptRecord() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		principal=sc.nextDouble();
		System.out.println("Enter Annual Interest Rate:");
		annualInterestRate=sc.nextDouble();
		System.out.println("Enter Loan Term");
		loanTerm=sc.nextInt();
		sc.close();
	}
	
	 public double calculateMonthlyPayment() {
		 double monthlyInterestRate = (annualInterestRate / 12) / 100 ;
		 int numberOfMonths = loanTerm * 12;
	     return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) / 
	                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
	 }
	 
	 public void printRecord() {
		    double monthlyPayment = calculateMonthlyPayment();
	        double totalPayment = monthlyPayment * loanTerm * 12;
	        System.out.printf("Monthly Payment: INR%.2f%n", monthlyPayment);
	        System.out.printf("Total Payment over the life of the loan: INR%.2f%n", totalPayment);
	 }
	
         
}
