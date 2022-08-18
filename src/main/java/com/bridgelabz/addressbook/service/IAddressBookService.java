package com.bridgelabz.addressbook.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestHeader;

import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.util.Response;

public interface IAddressBookService {

	AddressBookModel addAddressBook(AddressDTO addressdto);

	AddressBookModel updateAddressBook(AddressDTO addressdto ,Long id,String token);

	List<AddressBookModel> getAddressBookDataById(Long id,String token);

	List<AddressBookModel> getAddressBookData(String token);

	AddressBookModel deleteEmployee(Long id,String token);

	Response login(String emailId, String password);

}
