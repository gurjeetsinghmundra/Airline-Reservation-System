package com.learn.Airline.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat {
	

//    private Flight flight;

    @Id
    private String seatNumber;
    
    @Column(nullable = false)
    private String classType; 

}
