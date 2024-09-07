package Day3;

import java.util.Scanner;

public class BMITracker {
 
	private double weight;
	private double height;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in Kilogram:");
		weight=sc.nextDouble();
		System.out.println("Enter Height in Meter:");
		height=sc.nextDouble();
		sc.close();
	}
	
	public double calculateBMI() {
		return weight/(height*height);
	}
	
	public String  classifyBMI(double BMI) {
		if(BMI<18.5)
        {
        	return "underweight";
        }
        else if(BMI>=18.5 && BMI<=24.9)
        {
        	return "Normal Weight";
        }
        else if(BMI>=25 && BMI<=29.9)
        {
        	return "Overrweight";
        }
        else
        {
        	return "You are obese";
        }
	}
		public void printRecord() {
			double BMI=calculateBMI();
			String classification=classifyBMI(BMI);
			System.out.printf("BMI: %.2f%n", BMI);
	        System.out.println("BMI Classification: " +classification);
			
	}
		
}
