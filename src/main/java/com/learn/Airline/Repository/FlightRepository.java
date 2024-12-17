package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Airline.Entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,String> {

}
