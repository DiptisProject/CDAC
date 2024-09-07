package Day3;

import java.util.Scanner;

public class DiscountCalculator {

	private double originalPrice;
	private double discountRate;
	
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Original Price:");
        originalPrice=sc.nextDouble();
        System.out.println("Discount Percentage:");
        discountRate=sc.nextDouble();
        sc.close();
	}    
    public double calculateDiscount() {
    	return  originalPrice * (discountRate / 100);
     
	}
    public void printRecord() {
    	double discountAmount=calculateDiscount();
    	double finalPrice=originalPrice - discountAmount;
    	System.out.printf("Discount Amount: INR %.2f%n", discountAmount);
        System.out.printf("Final Price after discount: INR %.2f%n", finalPrice);
    }
}
