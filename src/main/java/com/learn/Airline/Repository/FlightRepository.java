package com.learn.Airline.Repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Airline.Entity.Flight;
import com.learn.Airline.Projection.FlightProjection;
import com.learn.Airline.Projection.SeatProjection;

@RepositoryRestResource(excerptProjection = FlightProjection.class ) 

@CrossOrigin
public interface FlightRepository extends JpaRepository<Flight,String> {
	
	//A-z
	List<Flight> findByOrderByFlightNameAsc();
	
	//Z-a
	List<Flight> findByOrderByFlightNameDesc();
	

	//Search
	List<Flight> findBydepartureAirportAndArrivalAirportAndDepartureTimeAndArrivalTime
	(String departureAirport,String arrivalAirport,
	LocalDateTime departureTime,LocalDateTime arrivalTime);
	
}
