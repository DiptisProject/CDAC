package org.java.day6;
// question 1
import java.util.Scanner;

public class SDArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
		Scanner sc = new Scanner(System.in);
	    System.out.println("Default Value of Array:");
		  for(int i=0;i<arr.length;++i)
		  {
			System.out.print(arr[i]+" ");
		  }
		  System.out.println(" ");
		  System.out.println(" Accept Array Element ");
		  for(int i=0;i<arr.length; ++i)
		  {
		    System.out.print("Enter Array [" +i+"]: ");
		    arr[i]=sc.nextInt();
		  }
		  
		  System.out.println(" \n Print  Array Element ");
		  for(int i=0;i<arr.length; ++i)
		  {
		    System.out.print(arr[i]+" ");
		  
		  }
		  sc.close();
	}
}
