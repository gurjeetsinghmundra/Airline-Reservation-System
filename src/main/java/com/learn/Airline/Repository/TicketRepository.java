package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Airline.Entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
