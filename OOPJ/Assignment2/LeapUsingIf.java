package Assignment2;
import java.util.*;

public class LeapUsingIf {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		if((year %4==0 && year%100!= 0 )|| (year%400==0))
		{
			System.out.println(year+ " is a leap year");
		}
		else
		{
			System.out.println(year+ " not a leap year");
		}

	}

}
