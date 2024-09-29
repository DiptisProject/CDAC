package Assignment2;

import java.util.Scanner;

public class ReverseString {

	public static String reverse(String str1) {
		StringBuilder strb= new StringBuilder(str1);
		return strb.reverse().toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a String:");
       String str= sc.nextLine();
       
       String reversestring = reverse(str);;
       System.out.println("Reverese String: " +reversestring);
       sc.close();
	}

}
