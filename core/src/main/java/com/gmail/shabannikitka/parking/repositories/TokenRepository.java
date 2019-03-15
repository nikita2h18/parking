package com.gmail.shabannikitka.parking.repositories;

import com.gmail.shabannikitka.parking.entity.Token;
import com.gmail.shabannikitka.parking.entity.Renter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends CrudRepository<Token, Long> {

    Optional<Token> findByToken(String token);

}
