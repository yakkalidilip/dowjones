package com.example.bootcamp.exception;

public class EmployeeNotFoundException extends RuntimeException {
	private String message;

	public EmployeeNotFoundException() {
	}

	public EmployeeNotFoundException(String msg) {
		super(msg);
		this.message = msg;
	}
}
