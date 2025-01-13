package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.Airline.Entity.User;

@CrossOrigin
public interface UserRepository extends JpaRepository<User, String>{

}
