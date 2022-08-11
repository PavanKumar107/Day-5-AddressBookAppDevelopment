package com.bridgelabz.addressbook.service;

import java.util.List;

import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;

public interface IAddressBookService {

	AddressBookModel addAddressBook(AddressDTO addressdto);

	AddressBookModel updateAddressBook(AddressDTO addressdto ,Long id);

	List<AddressBookModel> getAddressBookData(Long id);

	List<AddressBookModel> getAddressBookData();

	AddressBookModel deleteEmployee(Long id);

}
