package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Airline.Entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, String> {

}
