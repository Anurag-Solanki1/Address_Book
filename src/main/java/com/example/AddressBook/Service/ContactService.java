package com.example.AddressBook.Service;

import com.example.AddressBook.DTO.ContactDTO;
import java.util.List;
import java.util.Optional;

public interface ContactService {
    List<ContactDTO> getAllContacts();
    Optional<ContactDTO> getContactById(Long id);
    ContactDTO addContact(ContactDTO contactDTO);
    ContactDTO updateContact(Long id, ContactDTO contactDTO);
    boolean deleteContact(Long id);
}