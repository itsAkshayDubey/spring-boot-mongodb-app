package com.github.itsAkshayDubey.springbootnosql.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.github.itsAkshayDubey.springbootnosql.exception.UserNotFoundException;

@ControllerAdvice
public class UserNotFoundExceptionController {

	private static Logger logger = LoggerFactory.getLogger(UserNotFoundExceptionController.class);
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<Object> exception(UserNotFoundException exception) {
		logger.error(exception.getMessage());
		return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
	}

}
