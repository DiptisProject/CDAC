package Assignment2;

import java.util.Scanner;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int[] arr= new int[size];
		for(int j=0;j<arr.length;j++)
		{
			System.out.println("Enter arr["+j+"])");
			arr[j]=sc.nextInt();
		}
		System.out.println("Array is:");
		for(int arr2:arr)
		{
			System.out.print(arr2+" ");
		}
		System.out.println();
		System.out.println("Enter value of d:");
		int d=sc.nextInt();
		for(int i=d;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	    for(int i=0;i<d;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    
	    sc.close();
	}

}
