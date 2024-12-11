package com.learn.Airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Airline.Entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
