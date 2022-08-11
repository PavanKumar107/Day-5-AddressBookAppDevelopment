package com.bridgelabz.addressbook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressbook.dto.AddressDTO;

import lombok.Data;

@Entity
@Table(name = "addressbook")
@Data
public class AddressBookModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aadharNumber;
	private String firstName;
	private String lastName;
	private long mobileNumber;
	private String city;	
	private String state;
	private long pincode;
	private String email;
	private String password;

	public AddressBookModel() {

	}

	public AddressBookModel(AddressDTO addressdto) {
		this.aadharNumber = addressdto.getAadharNumber();
		this.firstName = addressdto.getFirstName();
		this.lastName = addressdto.getLastName();
		this.mobileNumber = addressdto.getMobileNumber();
		this.city = addressdto.getCity();
		this.state = addressdto.getState();
		this.pincode = addressdto.getPincode();
		this.email = addressdto.getEmail();
		this.password = addressdto.getPassword();
	}
}
