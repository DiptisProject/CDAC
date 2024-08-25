//Write a program to find and print the largest digit in the number 4825
import java.util.*;
class LargestDigit{
	public static void main(String[] args)
	{
		int num,rem=0,large=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			if(rem>large)
			{
				large=rem;
			}
			num=num/10;
			
		}
		System.out.println("Largest Digit:"+large);
	}
}