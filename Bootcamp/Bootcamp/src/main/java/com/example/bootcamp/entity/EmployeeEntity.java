package com.example.bootcamp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "EMPLOYEES")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "fName")
	
	private String fname;
	@Column(name = "lName")
	private String lname;
	@Column(name = "email")
	private String email;

}
