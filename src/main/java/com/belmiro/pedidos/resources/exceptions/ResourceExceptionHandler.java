package com.belmiro.pedidos.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.belmiro.pedidos.services.exception.ValidationException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<StandardError> categoriaNotFound(ValidationException validationException,
			HttpServletRequest request) {

		StandardError standardError = 
				new StandardError(HttpStatus.NOT_FOUND.value(), 
				validationException.getMessage(),
				System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);

	}

}
