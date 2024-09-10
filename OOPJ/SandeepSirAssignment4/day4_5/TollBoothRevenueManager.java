package com.java.day4_5;

public class TollBoothRevenueManager {

	double carToll;
	double truckToll;
	double motorCycleToll;
	int carCount;
	int trucount;
	int motorCycleCount;
	public TollBoothRevenueManager(double carToll, double truckToll, double motorCycleToll, int carCount, int trucount,
			int motorCycleCount) {
		super();
		this.carToll = carToll;
		this.truckToll = truckToll;
		this.motorCycleToll = motorCycleToll;
		this.carCount = carCount;
		this.trucount = trucount;
		this.motorCycleCount = motorCycleCount;
	}
	public double getCarToll() {
		return carToll;
	}
	public void setCarToll(double carToll) {
		this.carToll = carToll;
	}
	public double getTruckToll() {
		return truckToll;
	}
	public void setTruckToll(double truckToll) {
		this.truckToll = truckToll;
	}
	public double getMotorCycleToll() {
		return motorCycleToll;
	}
	public void setMotorCycleToll(double motorCycleToll) {
		this.motorCycleToll = motorCycleToll;
	}
	public int getCarCount() {
		return carCount;
	}
	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}
	public int getTrucount() {
		return trucount;
	}
	public void setTrucount(int trucount) {
		this.trucount = trucount;
	}
	public int getMotorCycleCount() {
		return motorCycleCount;
	}
	public void setMotorCycleCount(int motorCycleCount) {
		this.motorCycleCount = motorCycleCount;
	}
	@Override
	public String toString() {
		return "TollBoothRevenueManager [carToll=" + carToll + ", truckToll=" + truckToll + ", motorCycleToll="
				+ motorCycleToll + ", carCount=" + carCount + ", trucount=" + trucount + ", motorCycleCount="
				+ motorCycleCount + "]";
	}
	
	public double calculateRevenue() {
		double carRevenue=carCount*carToll;
		double truckRevenue=trucount*truckToll;
		double motarCylceRevenue=motorCycleCount*carToll;
		double revenue=carRevenue+truckRevenue+motarCylceRevenue;
		return revenue;
		
	}

	
}
