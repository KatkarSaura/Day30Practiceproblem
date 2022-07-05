package com.bridgelabz;

public class CabInvoiceServiceTest {
	
	@Test
	void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.5;
		int time = 2;
		double totalFare = invoiceGenerator.calculateFare(distance,time);
		
		Assertions.assertEquals(27,totalFare);
	}
	
	@Test
	void givenDistanceAndTime_ShouldReturnMinimumFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double totalFare = invoiceGenerator.calculateFare(distance, time);
		
		Assertions.assertEquals(5,totalFare);
		
	}
	
	@Test
	void givenMultipleRides_ShouldReturnAggregateFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = {new Ride(3,4), new Ride(6,9), new Ride(0.1,1)};
		double aggregateTotal = invoiceGenerator.calculateFare(rides);
		
		Assertions.assertEquals(108.0,aggregateTotal);

		
		

		
	}

	

}
