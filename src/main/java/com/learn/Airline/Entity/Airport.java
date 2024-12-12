package com.learn.Airline.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airport {
	
	private String airportCode;
	
    private String airportName;
    
    private String city;
    
    private String country;

}
