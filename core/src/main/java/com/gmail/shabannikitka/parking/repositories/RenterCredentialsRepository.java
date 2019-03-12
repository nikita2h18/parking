package com.gmail.shabannikitka.parking.repositories;

import com.gmail.shabannikitka.parking.entity.RenterCredentials;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RenterCredentialsRepository extends CrudRepository<RenterCredentials, Long> {
    Optional<RenterCredentials> findByLogin(String login);
}
