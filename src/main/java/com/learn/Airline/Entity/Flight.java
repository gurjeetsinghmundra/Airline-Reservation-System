package com.learn.Airline.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
	
	@Id
	private String flightNumber;
	
	private String flightName;
	
	private String departureAirport;
	
    private String arrivalAirport;
	
	private LocalDateTime departureTime;
	
    private LocalDateTime arrivalTime;
    
    private int availableSeats;
	

}
