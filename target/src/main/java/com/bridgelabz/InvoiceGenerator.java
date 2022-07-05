package com.bridgelabz;

public class InvoiceGenerator {
	final static double COST_PER_KM =10;
	final static double MINIMUM_FARE = 5;
	final static double COST_PER_MINUTE = 1;

	public double calculateFare(double distance, int time) {
	double totalFare = (distance * COST_PER_KM) + (time * COST_PER_MINUTE);
	if(totalFare < MINIMUM_FARE)
		totalFare = MINIMUM_FARE;
		return totalFare;
	}

}
