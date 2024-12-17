package com.learn.Airline.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passenger {
	
	
	@Id
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
	private int phoneNumber;
	
	@Column(nullable = false)
	private String address;


}
