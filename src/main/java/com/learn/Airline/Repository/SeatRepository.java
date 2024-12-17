package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Airline.Entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, String> {

}
