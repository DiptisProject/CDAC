package org.java.day6;
//question 6
public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,4,5,6,7};
		int N=7;
		int totalSum=0;
		int arrSum=0;
		
		System.out.println("Array Element are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<=N;i++)
		{
			totalSum +=i;
		}
		for(int i=0;i<arr.length;i++)
		{
			arrSum+=arr[i];
		}
		int missSum=totalSum-arrSum;
		System.out.println("Missing Element:"+missSum);

	}

}
