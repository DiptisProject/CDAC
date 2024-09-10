package com.java.day4_5;

import java.util.Scanner;

public class TollBoothRevenueManagerUtil {
	TollBoothRevenueManager TBR;
	static Scanner sc=new Scanner(System.in);
	public TollBoothRevenueManagerUtil()
	{
		this.TBR=new TollBoothRevenueManager(0, 0, 0, 0, 0, 0);
				
	}
	
	public void setTroll() {
		System.out.println("Enter Car toll:");
		this.TBR.setCarToll(sc.nextDouble());
		System.out.println("Enter Truck toll:");
	    this.TBR.setTruckToll(sc.nextDouble());
		System.out.println("Enter Motor Cycle toll:");
		this.TBR.setMotorCycleToll(sc.nextDouble());	
	}
     public void acceptRecord() {
		
		System.out.println("Enter Number of Car:");
		this.TBR.setCarCount(sc.nextInt());
		System.out.println("Enter Number of Truck:");
		this.TBR.setTrucount(sc.nextInt());
		System.out.println("Enter Number of Motor Cycle ");
		this.TBR.setMotorCycleCount(sc.nextInt());
		
      }
      public void printRecord() {
	      int totalVechicle=  TBR.carCount+TBR.trucount+TBR.motorCycleCount;
	     double totalNoRevenue= TBR.calculateRevenue();
	     System.out.println("Total Vechicle:"+totalVechicle);
	     System.out.printf("Total Revenue:%.2f",totalNoRevenue);
	     System.out.println();
       }
       public static int menuList()
       {
	       System.out.println("1.Enter Vehicle toll");
	       System.out.println("2.Enter Number of Vehile");
	       System.out.println("3.Display All");
	       System.out.println("0.Exit");
	       System.out.println("Enter your choice");
	       return sc.nextInt();
        }

      }
