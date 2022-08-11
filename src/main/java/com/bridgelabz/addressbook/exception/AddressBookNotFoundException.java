package com.bridgelabz.addressbook.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AddressBookNotFoundException extends RuntimeException {
	private int statuscode;
	private String message;

	public AddressBookNotFoundException(int statuscode, String message) {
		super(message);
		this.statuscode = statuscode;
		this.message = message;
	}
}
