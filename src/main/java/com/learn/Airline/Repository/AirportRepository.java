package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Airline.Entity.Airport;

public interface AirportRepository extends JpaRepository<Airport, String> {

}
