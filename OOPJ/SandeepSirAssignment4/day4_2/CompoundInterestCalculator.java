package com.java.day4_2;

public class CompoundInterestCalculator {
	
	private double principal;
	private double annualInterestRate;
	private int numberOfCompound;
	private int year;
	
	public CompoundInterestCalculator(double principal, double annualInterestRate, int numberOfCompound, int year) {
		super();
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.numberOfCompound = numberOfCompound;
		this.year = year;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getNumberOfCompound() {
		return numberOfCompound;
	}

	public void setNumberOfCompound(int numberOfCompound) {
		this.numberOfCompound = numberOfCompound;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CompoundInterestCalculator [principal=" + principal + ", annualInterestRate=" + annualInterestRate
				+ ", numberOfCompound=" + numberOfCompound + ", year=" + year + "]";
	}
	
	public double calculateFutureValue() {
		double rate=annualInterestRate/100;
		return principal * Math.pow(1 + rate /numberOfCompound, numberOfCompound * year);
	}
	
	 public double calculateTotalInterest() {
	        return calculateFutureValue() - principal;
	    }
}
