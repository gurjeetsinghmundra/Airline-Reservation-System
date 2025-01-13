package com.learn.Airline.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@Column(nullable = false)
    private String airportName;
    
	@Column(nullable = false)
    private String city;
    
	@Column(nullable = false)
    private String country;
	
	
//	Relations
	
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},mappedBy= "airport" )
	private List<Flight> flights;
	
	

}
