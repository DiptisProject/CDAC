package Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void reverse(int[]arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n= sc.nextInt(); 
        
        int[]arr1=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr1[i]=sc.nextInt();
        }
        
        reverse(arr1);
        System.out.println("Reversed Array elements:" +Arrays.toString(arr1));
        
        sc.close();       
	}

}
