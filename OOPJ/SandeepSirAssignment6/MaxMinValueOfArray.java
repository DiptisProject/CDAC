package org.java.day6;
//question 3
import java.util.Scanner;

public class MaxMinValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []arr=new int[5];
		System.out.println("Array Element");
		for(int i=0;i<arr.length;++i)
		{
			System.out.print("array["+i+"]:");
	        arr[i]=sc.nextInt();
		}
		
		System.out.println("\n Display Array");
		for(int i=0;i<arr.length;++i)
		{
			System.out.print(arr[i]+" ");
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;++i)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if (arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("\n..........................");
		System.out.println("Maximum Element:"+max);
		System.out.println("Minimum Element:"+min);
		sc.close();
	}

}
