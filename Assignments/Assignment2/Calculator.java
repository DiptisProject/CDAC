import java.util.*;
class Calculator
{
	public static void main(String[] args)
	{
		int no1,no2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		no1=sc.nextInt();
		System.out.println("Enter Second Number:");
		no2=sc.nextInt();
		System.out.println(" 1.Addition\n 2.Subtration\n 3.Multipliation\n 4.Division");
		System.out.println("Enter choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1: result=no1+no2;
			System.out.println("Addition of two number:"+result);
			break;
			
			case 2: result=no1-no2;
			System.out.println("Subtraction of two number:"+result);
			break;
			
			case 3: result=no1*no2;
			System.out.println("Multiplication of two number:"+result);
			break;
			
			case 4: 
			if(no2!=0)
			{
			 result=no1/no2;
			 System.out.println("Division of two number:"+result);
			}
			else
			{
				System.out.println("Error:Division by zero not allowed");
			}
			break;
			
			default:
			System.out.println("Invalid Input");
			
		}
	}
}