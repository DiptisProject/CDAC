package Assignment5;
//question 2
public class Car extends Vehicle {

	private String model;
	
	public Car(String make, int year, String model) {
	  super(make, year);
	  this.model = model;
	}

	public void displayDetails() {
	   super.displayDetails();  
	   System.out.println("Model: " + model);
	}
	
}
