package Assignment2;

import java.util.Scanner;

public class BMI 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter weight in kilogram: ");
		        double weight = sc.nextDouble();

		        System.out.print("Enter height in meters: ");
		        double height = sc.nextDouble();

		        double BMI = weight / (height * height);

		        if(BMI<18.5)
		        {
		        	System.out.println("underweight");
		        }
		        else if(BMI>=18.5 && BMI<=24.9)
		        {
		        	System.out.println("Normal Weight");
		        }
		        else if(BMI>=25 && BMI<=29.9)
		        {
		        	System.out.println("Overrweight");
		        }
		        else
		        {
		        	System.out.println("You are obese");
		        }

		      
	}

 }

