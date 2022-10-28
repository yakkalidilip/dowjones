package com.example.bootcamp.controller;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootcamp.entity.EmployeeEntity;
import com.example.bootcamp.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/saveEmployee")
	public String saveEmployee(EmployeeEntity employee) {
		
		
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/getAllEmployees")
	public List<EmployeeEntity> getAll() {
		return employeeService.fetchEmployees();

	}

	@GetMapping("/getEmployee/{employeeId}")
	public ResponseEntity getEmployeeById(@PathVariable Integer employeeId) {
		return employeeService.fetchEmployeeById(employeeId);

	}
	
	//@GetMapping("/readingXML")
	//public String getEmployeeById() {
	//	File fileName=new File()
		//FileUtils.readFileToByteArray(arg0)

	//}

}
