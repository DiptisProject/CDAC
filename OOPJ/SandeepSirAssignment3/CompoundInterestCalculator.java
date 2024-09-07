package Day3;

import java.util.Scanner;

public class CompoundInterestCalculator {
	
	private double principal;
	private double annualInterestRate;
	private int numberOfCompound;
	private int year;
	
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Initial Investment Amount:");
		principal=sc.nextDouble();
		System.out.println("Annual Interest Rate:");
		annualInterestRate=sc.nextDouble();
		System.out.println("Number of times the interest is compounded per year");
		numberOfCompound=sc.nextInt();
		System.out.println("Investment Duration:");
		year=sc.nextInt();
		
		sc.close();
	}	
	public double calculateFutureValue() {
		double rate=annualInterestRate/100;
		return principal * Math.pow(1 + rate /numberOfCompound, numberOfCompound * year);
	}
	
	public void printRecord(){
		 double futureValue = calculateFutureValue();
	     double totalInterest = futureValue - principal;
	     System.out.printf("Future Value: INR %.2f%n", futureValue);
	     System.out.printf("Total Interest Earned: INR %.2f%n", totalInterest);
	}
		
}
