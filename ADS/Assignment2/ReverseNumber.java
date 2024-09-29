package Assignment2;

import java.util.Scanner;

public class ReverseNumber {

	private static int reverse(int num) {
		// TODO Auto-generated method stub
		int reversed=0;
		int remainder;
		
		while (num > 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;  
            num /= 10;
        }
		return reversed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Number:");
	    int  num= sc.nextInt();
	       
	    int reversenumber = reverse(num);
	    System.out.println("Reverese Number: " +reversenumber);
	    sc.close();

	}

}
