package com.bridgelabz.addressbook.dto;

import lombok.Data;

@Data
public class AddressDTO {
	
	private long aadharNumber;
	private String firstName;
	private String lastName;
	private long mobileNumber;
	private String city;	
	private String state;
	private long pincode;
	private String email;
	private String password;
}
