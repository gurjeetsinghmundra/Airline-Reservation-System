package com.learn.Airline.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

		@Id
	    private int ticketNumber;
	    
		@Column(nullable = false)
	    private String seatNumber;
	    
		@Column(nullable = false)
	    private LocalDateTime issueDate;
	   
}
