package com.example.bootcamp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.example.bootcamp.entity.EmployeeEntity;
import com.example.bootcamp.exception.ErrorResponse;
import com.example.bootcamp.repository.EmployeeRepo;

@Component
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;

	public String saveEmployee(EmployeeEntity employee) {
		try {
			employeeRepo.save(employee);
			return "Employee saved successfully";
		} catch (Exception e) {
			return "Employee failed to save,error details " + e.getMessage();
		}

	}

	public List<EmployeeEntity> fetchEmployees() {
		return employeeRepo.findAll();
	}

	public ResponseEntity fetchEmployeeById(Integer employeeId) {
		try {
			Optional<EmployeeEntity> optEntity = employeeRepo.findById(employeeId);
			if (optEntity.isPresent()) {
				EmployeeEntity entity = optEntity.get();
				return new ResponseEntity<>(entity, new HttpHeaders(), HttpStatus.OK);
			} else {
				ErrorResponse error = new ErrorResponse();
				error.setMessage("Employee not found for id:" + employeeId);
				error.setStatusCode(404);
				return new ResponseEntity<>(error, new HttpHeaders(), HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			ErrorResponse error = new ErrorResponse();
			error.setMessage("Employee not found for id:" + employeeId);
			error.setStatusCode(404);
			return new ResponseEntity<>(error, new HttpHeaders(), HttpStatus.NOT_FOUND);

		}
	}

}
