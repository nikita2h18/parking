package com.gmail.shabannikitka.parking.repositories;

import com.gmail.shabannikitka.parking.entity.Rent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {
    Optional<Rent> findByRenter(Rent rent);
}
