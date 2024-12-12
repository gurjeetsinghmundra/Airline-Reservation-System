package com.learn.Airline.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
	
	private String flightNumber;
	
	private LocalDateTime departureTime;
	
    private LocalDateTime arrivalTime;
    
    private int availableSeats;
	
	
	
	

}
