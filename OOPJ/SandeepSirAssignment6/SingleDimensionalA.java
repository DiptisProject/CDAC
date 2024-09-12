package org.java.day6;
// question 2
import java.util.Scanner;

public class SingleDimensionalA {
	int[]arr=new int[5];
	private Scanner sc= new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Accept Record");
		for(int i=0;i<arr.length;++i) {
			System.out.print("array ["+i+"]:");
			arr[i]=sc.nextInt();
		}	
	}
	public void printRecord() {
		System.out.println("\nPrint Record");
		for(int i=0;i<arr.length;++i) {
			System.out.print(arr[i]+" ");
		}	
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDimensionalA  s=new SingleDimensionalA();
		s.acceptRecord();
		s.printRecord();      
	}

}
