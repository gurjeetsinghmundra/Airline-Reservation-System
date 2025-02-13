package com.learn.Airline.Projection;

import org.springframework.beans.factory.annotation.Value;

public interface SeatProjection {

	
	String getSeatNumber();
	
	String getClassType();
	
	Boolean getOccupied();
	
	@Value("#{target.passenger?.passengerFirstName}")
	String getPassengerFirstName();
	
//	@Value("#{target.passenger?.passengerLastName}")
//	String getPassengerLastName();
//	
//	@Value("#{target.passenger?.dateOfBirth}")
//	String getDateOfBirth();
//	
//	@Value("#{target.passenger?.gender}")
//	String getGender();
//	
//	@Value("#{target.passenger?.passportNumber}")
//	String getPassportNumber();
//	
//	@Value("#{target.passenger?.nationality}")
//	String getNationality();
//	
//	@Value("#{target.passenger?.phoneNumber}")
//	String getPhoneNumber();
//	
//	@Value("#{target.passenger?.address}")
//	String getAddress();
	
	
	
	
}
