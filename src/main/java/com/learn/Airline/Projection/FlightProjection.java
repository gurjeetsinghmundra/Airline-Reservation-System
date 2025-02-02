package com.learn.Airline.Projection;

import java.time.LocalDateTime;

public interface FlightProjection {
	
	String getFlightNumber();
	
	String getFlightName();
	
	String getDepartureAirport();
	
	String getArrivalAirport();
	
	LocalDateTime getDepartureTime();
	
	LocalDateTime getArrivalTime();
	
	int getAvailableSeats();
	
	int getTotalSeats();


}

