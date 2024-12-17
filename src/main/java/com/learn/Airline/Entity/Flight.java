package com.learn.Airline.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
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
	
	@Column(nullable = false)
	private String flightName;
	
	@Column(nullable = false)
	private String departureAirport;
	
	@Column(nullable = false)
    private String arrivalAirport;
	
	@Column(nullable = false)
	private LocalDateTime departureTime;
	
	@Column(nullable = false)
    private LocalDateTime arrivalTime;
    
	@Column(nullable = false)
    private int availableSeats;
	

}
