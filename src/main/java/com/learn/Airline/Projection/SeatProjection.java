package com.learn.Airline.Projection;

import org.springframework.beans.factory.annotation.Value;

public interface SeatProjection {

	
	String getSeatNumber();
	
	String getClassType();
	
	Boolean getOccupied();
	
	@Value("#{target.passenger?.passengerFirstName}")
	String getPassengerFirstName();
	
	
	
	
	
	
}
