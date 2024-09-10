package com.java.day4_4;

import java.util.Scanner;

public class DiscountCalculatorUtil {

	private Scanner sc = new Scanner(System.in);
    private DiscountCalculator disc;
    
    public void acceptRecord() {
        System.out.print("Enter Original Price (₹): ");
        double originalPrice = sc.nextDouble();
        
        System.out.print("Enter Discount Percentage (%): ");
        double discountRate = sc.nextDouble();
        
        disc = new DiscountCalculator(originalPrice, discountRate);
    }
    public void printRecord() {
    	if (disc != null) {
    	double discountAmount=disc.calculateDiscountAmount();
    	double finalPrice=disc.calculateFinalPrice();
    	System.out.printf("Discount Amount: INR %.2f%n", discountAmount);
        System.out.printf("Final Price after discount: INR %.2f%n", finalPrice);
    }
   }
    	
    public void menuList() {
            while (true) {
                System.out.println("....Menu List....");
                System.out.println("1. Enter Item Details");
                System.out.println("2. Display Discount and Final Price");
                System.out.println("3. Exit");
                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        acceptRecord();
                        break;
                    case 2:
                        printRecord();
                        break;
                    default:
                    	System.out.println("Invalid");
                    	break;
                 }
            }
    }
}