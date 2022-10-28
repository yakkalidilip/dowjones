package com.example.bootcamp.exception;

public class StockNotFoundException extends RuntimeException {
	private String message;

	public StockNotFoundException() {
	}

	public StockNotFoundException(String msg) {
		super(msg);
		this.message = msg;
	}
}
