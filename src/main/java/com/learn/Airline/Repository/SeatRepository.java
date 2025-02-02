package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Airline.Entity.Seat;
import com.learn.Airline.Projection.SeatProjection;


@RepositoryRestResource(excerptProjection = SeatProjection.class ) 
@CrossOrigin
public interface SeatRepository extends JpaRepository<Seat, String> {
	
	

}
