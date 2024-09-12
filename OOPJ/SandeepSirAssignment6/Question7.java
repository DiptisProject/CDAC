package org.java.day6;

import java.util.Scanner;

//question 
public class Question7 {
     private int[]record;
     private Scanner sc=new Scanner(System.in);
     
	 public Question7(int size) {
		record = new int[size];
	}
	
	public void acceptRecord()
	{
		System.out.println("Enter " +record.length+ " records");
		for(int i=0;i<record.length;i++)
		{
			System.out.print("record["+i+"]:");
			record[i]=sc.nextInt();
		}
	}
	
	public void printRecord()
	{	
		System.out.println(" ");
		System.out.println("Display records:");
		for(int i=0;i<record.length;i++)
		{
			System.out.println(record[i]);
		}
	}	
}
