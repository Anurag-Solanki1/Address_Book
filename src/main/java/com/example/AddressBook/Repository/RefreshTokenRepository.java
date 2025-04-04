package com.example.AddressBook.Repository;

import com.example.AddressBook.Model.RefreshToken;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RefreshTokenRepository  extends CrudRepository<RefreshToken, Integer> {

    Optional<RefreshToken> findByToken(String token);
}
