package com.bridgelabz.addressbook.service; 

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bridgelabz.addressbook.dto.AddressDTO;
import com.bridgelabz.addressbook.exception.AddressBookNotFoundException;
import com.bridgelabz.addressbook.model.AddressBookModel;
import com.bridgelabz.addressbook.repository.AddressBookRepository;
import com.bridgelabz.addressbook.util.TokenUtil;

@Service
public class AddressBookService implements IAddressBookService{
	
	@Autowired
	AddressBookRepository addressRepository;

	@Override
	public AddressBookModel addAddressBook(AddressDTO addressdto) {
		AddressBookModel model = new AddressBookModel(addressdto);
		addressRepository.save(model);
		return model;
	}

	@Override
	public AddressBookModel updateAddressBook(AddressDTO addressdto, Long id) {
		Optional<AddressBookModel>isAddressBookPresent = addressRepository.findById(id);
		if(isAddressBookPresent.isPresent()) {
			isAddressBookPresent.get().setFirstName(addressdto.getFirstName());
			isAddressBookPresent.get().setFirstName(addressdto.getFirstName());
			isAddressBookPresent.get().setLastName(addressdto.getLastName());
			isAddressBookPresent.get().setMobileNumber(addressdto.getMobileNumber());
			isAddressBookPresent.get().setCity(addressdto.getCity());
			isAddressBookPresent.get().setState(addressdto.getState());
			isAddressBookPresent.get().setPincode(addressdto.getPincode());
			isAddressBookPresent.get().setEmail(addressdto.getEmail());
			isAddressBookPresent.get().setPassword(addressdto.getPassword());
			addressRepository.save(isAddressBookPresent.get());
			return isAddressBookPresent.get();
		}
		throw new AddressBookNotFoundException(400,"AddressBook Not Present!!");
	}

	@Override
	public List<AddressBookModel> getAddressBookData(Long id) {
		Optional<AddressBookModel> isAddressBookPresent = addressRepository.findById(id);
		if (isAddressBookPresent.isPresent()) {
			List<AddressBookModel> getAddressBookData = addressRepository.findAll();
			if (getAddressBookData.size()>0) {
				return getAddressBookData;
			}
			else {
				throw new AddressBookNotFoundException(400,"No Data Present");
			}
		}
		throw  new AddressBookNotFoundException(400, "AddressBook not found");
	}

	@Override
	public List<AddressBookModel> getAddressBookData() {
		List<AddressBookModel> getAddressBookData = addressRepository.findAll();
		if (getAddressBookData.size()>0) {
			return getAddressBookData;
		}
		else {
			throw new AddressBookNotFoundException(400,"No Data Present");
		}
	}

	@Override
	public AddressBookModel deleteEmployee(Long id) {
		Optional<AddressBookModel> isAddressBookPresent=addressRepository.findById(id);
		if(isAddressBookPresent.isPresent()){
			addressRepository.delete(isAddressBookPresent.get());
			return isAddressBookPresent.get();
		}
		throw new AddressBookNotFoundException(400,"AddressBook Not Found");
	}
}
