package com.java.day4_4;

public class DiscountCalculator {
	
	private double originalPrice;
	private double discountRate;
	
	public DiscountCalculator(double originalPrice, double discountRate) {
		super();
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "DiscountCalculator [originalPrice=" + originalPrice + ", discountRate=" + discountRate + "]";
	}
	
	 public double calculateDiscountAmount() {
	        return originalPrice * (discountRate / 100);
	    }
	
	 public double calculateFinalPrice() {
	        return originalPrice - calculateDiscountAmount();
	    }
	

}
