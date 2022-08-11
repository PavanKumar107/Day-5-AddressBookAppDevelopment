package com.bridgelabz.addressbook.exception.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.bridgelabz.addressbook.exception.AddressBookNotFoundException;
import com.bridgelabz.addressbook.util.Response;

@ControllerAdvice
public class AddressBookExceptionHandler {
	@ExceptionHandler(AddressBookNotFoundException.class)
	public ResponseEntity<Response> handlerId(AddressBookNotFoundException ab) {
		Response response = new Response();
		response.setErrorcode(400);
		response.setMessage(ab.getMessage());
		return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
	}	
}
