package com.learn.Airline.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.Airline.Entity.User;


//Using service we have created a component and we can autowired object of that component
@Service
public class UserService {

	
	List<User> list=new ArrayList<>();
	
}
