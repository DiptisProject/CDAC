//Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6).
import java.util.*;
class SumDigit
{
	public static void main(String[] args)
	{
		int sum=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digit:"+sum);
	}
}