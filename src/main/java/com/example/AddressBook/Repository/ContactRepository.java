package com.example.AddressBook.Repository;

import com.example.AddressBook.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
