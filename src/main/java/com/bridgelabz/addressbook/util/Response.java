package com.bridgelabz.addressbook.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
	private int errorcode;
	private String message;

	public Response() {

	}
}
