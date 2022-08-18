package com.bridgelabz.addressbook.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bridgelabz.addressbook.model.AddressBookModel;
public interface AddressBookRepository extends JpaRepository<AddressBookModel, Long>{
	 Optional<AddressBookModel> findByEmailId(String email);
}
