package com.learn.Airline.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
    
    @Column(nullable = false)
//    private Boolean occupied=Boolean.FALSE;
    private Boolean occupied;
    
// Relations    
    
    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "seat")
    private Passenger passenger;
    
    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "seat1")
    private Ticket ticket;

    @ManyToOne
    private Flight flight;
    
}
