package com.bridgelabz.addressbook.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bridgelabz.addressbook.model.AddressBookModel;

public interface AddressBookRepository extends JpaRepository<AddressBookModel, Long>{

}
