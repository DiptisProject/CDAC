package Assignment2;

import java.util.Scanner;

public class LeapUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year = sc.nextInt();
		switch(year%4)
		{
		case 0 : 
			switch(year%100)
			{
			   case 0 :
				   switch(year%400)
			{
				case 0 : System.out.println(year+ " is a leap Year");
				break;
				default:System.out.println(year+ "is not a leap year");
				break;
			}
		   break;
		   default: System.out.println(year+ " is a leap year");
		   break;
	
		}
			break;
			default:System.out.println(year+ "is not a leap Year");
			break;
		}
       
	}

}
