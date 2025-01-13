package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Airline.Entity.Flight;


@CrossOrigin
public interface FlightRepository extends JpaRepository<Flight,String> {

}
