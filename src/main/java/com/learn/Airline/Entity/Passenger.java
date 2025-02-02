package com.learn.Airline.Entity;

import java.time.LocalDate;

//import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passenger {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String passengerId;
	
	@Column(nullable = false)
	private String passengerFirstName;
	
	@Column(nullable = false)
	private String passengerLastName;
	
	@Column(nullable = false)
	private LocalDate dateOfBirth;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private String passportNumber;
	
	@Column(nullable = false)
	private String nationality;
	
	@Column(nullable = false)
	private String phoneNumber;
	
	@Column(nullable = false)
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL) //dono taraf changes
	private Seat seat;
	
	

	


}
