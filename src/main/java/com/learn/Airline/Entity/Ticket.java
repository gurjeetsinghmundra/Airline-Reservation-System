package com.learn.Airline.Entity;

import java.time.LocalDateTime;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private int ticketNumber;
	    
		@Column(nullable = false)
	    private String seatNumber;
	    
		@Column(nullable = false)
	    private LocalDateTime issueDate;
		
//		Relations
		
		@ManyToOne
		private User user;
		
		@OneToOne(cascade = CascadeType.ALL) //dono taraf changes
		private Seat seat1;
		
		
	   
}
