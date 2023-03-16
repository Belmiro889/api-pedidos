package com.belmiro.pedidos.services.exception;

public class ValidationException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public ValidationException() {
	}

	public ValidationException(String msg) {
		super(msg);
	}

	public ValidationException(Exception msg) {
		super(msg);
	}

	public ValidationException(String msg, Throwable exThrowable) {
		super(msg, exThrowable);
	}

}
