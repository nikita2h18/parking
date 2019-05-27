package com.gmail.shabannikitka.parking.repositories;

import com.gmail.shabannikitka.parking.entity.Rent;
import com.gmail.shabannikitka.parking.entity.Renter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {
    Optional<Rent> findById(Long id);

    List<Rent> findAllByRenter(Renter renter);
}
