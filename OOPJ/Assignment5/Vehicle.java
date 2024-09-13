package Assignment5;
//question 2
public class Vehicle {
	
	protected String make;
	protected int year;
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public void displayDetails() {
		System.out.println("Make:"+make);
		System.out.println("Year:"+year);
	}
	
	

}
