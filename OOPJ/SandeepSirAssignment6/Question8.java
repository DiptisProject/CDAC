package org.java.day6;

import java.util.Scanner;

public class Question8 {

	private int[]record;
    private Scanner sc=new Scanner(System.in);
    
	 public Question8(int size) {
		record = new int[size];
	}

	public void setRecord() {
		System.out.println("Enter " +record.length+ " records");
		for(int i=0;i<record.length;i++)
		{
			System.out.print("record["+i+"]:");
			record[i]=sc.nextInt();
		}
	}
	
	public void getRecord() {
		System.out.println(" ");
		System.out.println("Display records:");
		for(int i=0;i<record.length;i++)
		{
			System.out.println(record[i]);
		}
	}	 
}
