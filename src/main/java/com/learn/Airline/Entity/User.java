package com.learn.Airline.Entity;

import java.util.List;


import jakarta.persistence.CascadeType;

// mvc - model view controller
//model is our entity and view
//controller is a median that takes request and give response


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
//import jakarta.validation.constraints.Max;
//import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	
	@Column(nullable = false)
	@NotBlank(message = "firstname cannot be blank")
	@NotNull(message = "firstname cannot be null")
	@Size (min =2 , max = 50)
	private String firstName;
	
	@Column(nullable = false)
	@NotBlank(message = "lastname cannot be blank")
	@NotNull(message = "lastname cannot be null")
	@Size (min =2 , max = 50)
	private String lastName;
	
	

	//regex101 community patterns
	@Pattern(regexp = "^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	@Column(nullable = false, unique = true)
	private String emailId;
	
	@Column(nullable = false)
	@NotBlank(message = "password cannot be blank")
	@NotNull(message = "password cannot be null")
	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	private String password;
	
	@Column(nullable = false)
	@NotNull(message = "age cannot be null")
	private int age;
	
	//Relations 
	
	@OneToMany(cascade ={CascadeType.PERSIST,CascadeType.MERGE},mappedBy = "user")
	private List<Ticket> tickets;
	
	private String userImage;
	
}
