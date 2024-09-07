package Day3;

import java.util.Scanner;

public class TollBoothRevenueManager {

	private double carTollRate;
	private double truckTollRate;
	private double motorCycleTollRate;
	public int carCount;
	public int truckCount;
	public int motorcyclecount;
	
	 public void setTollRates() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter toll rate for Car: ");
	        carTollRate = sc.nextDouble();
	        System.out.print("Enter toll rate for Truck: ");
	        truckTollRate = sc.nextDouble();
	        System.out.print("Enter toll rate for Motorcycles: ");
	        motorCycleTollRate = sc.nextDouble();
	    }
	 
	 public void acceptRecord() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number of Car:");
		 carCount=sc.nextInt();
		 System.out.println("Enter number of Truck");
		 truckCount=sc.nextInt();
		 System.out.println("Enter number of MotorCycle");
		 motorcyclecount=sc.nextInt();
	 }
	 
	 public double calculateRevenue() {
		    double carRevenue = carCount * carTollRate;
	        double truckRevenue = truckCount * truckTollRate;
	        double motorcycleRevenue = motorcyclecount * motorCycleTollRate;
	        return carRevenue + truckRevenue + motorcycleRevenue;
	 }
	 
	 public void printRecord() {
		 int totalVehicle=carCount+truckCount+motorcyclecount;
		 double totalNoRevenue=calculateRevenue();
		 System.out.println("Total Vehicle:"+totalVehicle);
		 System.out.printf("Total revenue: INR %.2f%n", totalNoRevenue);
	 }
	
}
