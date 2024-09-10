package com.java.day4_3;

public class BMITracker {

	 private double weight;
	 private double height;
	 
	 public BMITracker(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	 }

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "BMITracker [weight=" + weight + ", height=" + height + "]";
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
	 
	 
}
