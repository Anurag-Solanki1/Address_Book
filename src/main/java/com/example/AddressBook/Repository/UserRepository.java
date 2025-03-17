package com.example.AddressBook.Repository;

import com.example.AddressBook.Model.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<UserInfo, Long> {

    public UserInfo findByUsername(String username);
}
