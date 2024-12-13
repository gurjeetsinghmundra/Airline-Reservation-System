package com.learn.Airline.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Airport {
	
	@Id
	private String airportCode;
	
    private String airportName;
    
    private String city;
    
    private String country;

}
