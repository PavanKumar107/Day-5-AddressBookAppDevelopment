package com.bridgelabz.addressbook.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.service.IAddressBookService;
import com.bridgelabz.addressbook.util.Response;


@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	@Autowired
	IAddressBookService addressBookService;

	@PostMapping("/addaddressbook")
	public AddressBookModel addAddressBook(@Valid@RequestBody AddressDTO addressdto) {
		return addressBookService.addAddressBook(addressdto);
	}

	@PutMapping("udateaddressbook/{id}")
	public AddressBookModel updateAddressBook(@RequestBody AddressDTO addressdto,@PathVariable Long id,@RequestHeader String token) {
		return addressBookService.updateAddressBook(addressdto, id,token);
	}

	@GetMapping("/getaddressbookdata/{id}")
	public List<AddressBookModel> getAllAddressBookById(@PathVariable Long id,@RequestHeader String token) {
		return addressBookService.getAddressBookDataById(id,token);
	}

	@GetMapping("/getaddressbookalldata")
	public List<AddressBookModel> getAllAddressBooks(@RequestHeader String token) {
		return addressBookService.getAddressBookData(token);
	}

	@DeleteMapping("/deleteaddressbook/{id}")
	public AddressBookModel deleteAddressBookData(@PathVariable Long id,@RequestHeader String token){
		return addressBookService.deleteEmployee(id,token);
	}

	@PostMapping("/login")
	public Response login(@RequestParam String emailId, @RequestParam String password){
		return 	addressBookService.login(emailId,password);
	}
}

