package com.learn.Airline.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
	
    private Flight flight;

    private String seatNumber;
    
    private String classType; 

}
