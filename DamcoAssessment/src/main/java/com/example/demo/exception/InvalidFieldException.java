package com.example.demo.exception;

public class InvalidFieldException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidFieldException() {
		super("Custom exception is occuring...");
	}
}
