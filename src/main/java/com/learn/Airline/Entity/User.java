package com.learn.Airline.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@Column(nullable = false, unique = true)
	@NotBlank(message = "email id cannot be blank")
	@NotNull(message = "email id cannot be null")
	//regex101 community patterns
	@Pattern(regexp = "^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	private String emailId;
	
	@Column(nullable = false)
	@NotBlank(message = "password cannot be blank")
	@NotNull(message = "password cannot be null")
	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	private String password;
	
	@Column(nullable = false)
	@NotNull(message = "age cannot be null")
	private int age;

}
