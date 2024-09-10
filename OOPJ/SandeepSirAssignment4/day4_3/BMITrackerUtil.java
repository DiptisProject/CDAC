package com.java.day4_3;

import java.util.Scanner;

public class BMITrackerUtil {
    private Scanner sc= new Scanner(System.in);
    private BMITracker bt;
    
    public void acceptRecord() {
		System.out.println("Enter Weight in Kilogram:");
		double weight=sc.nextDouble();
		System.out.println("Enter Height in Meter:");
		double height=sc.nextDouble();
		
		bt=new BMITracker(weight, height);
	}
    
    public void printRecord() {
    	if(bt!=null) {
		  double BMI=bt.calculateBMI();
		  String classification=bt.classifyBMI(BMI);
		  System.out.printf("BMI: %.2f%n", BMI);
          System.out.println("BMI Classification: " +classification);
    	}
		
    }
    
    public void menuList() {
    	while(true)
    	{
    		System.out.println(".....Menu List....");
    		System.out.println("1.Enter Weight and Height:");
    		System.out.println("2.Display BMI Information");
    		System.out.println("Choose any Option ");
            
    		int choice=sc.nextInt();
    		switch(choice)
    		{
    		case 1:
    			   acceptRecord();
    			   break;
    		case 2:
    			   printRecord();
    			   break;
    		default:
    			System.out.println("Invalid ");
    		}
    	}
    	
    }
}
