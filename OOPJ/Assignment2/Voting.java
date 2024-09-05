package Assignment2;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Age:");
         int age = sc.nextInt();
         if(age>=18)
         {
        	 System.out.println("Person is eligible for voting");
         }
         else
         {
        	 System.out.println("Person is not eligible for voting");
         }
	}

}
