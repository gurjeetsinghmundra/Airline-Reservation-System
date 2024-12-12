package com.learn.Airline.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {


	    private String ticketNumber;
	    
	    private String seatNumber;
	    
	    private LocalDateTime issueDate;
	
}
