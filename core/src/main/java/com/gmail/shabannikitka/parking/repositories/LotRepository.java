package com.gmail.shabannikitka.parking.repositories;

import com.gmail.shabannikitka.parking.entity.Lot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LotRepository extends CrudRepository<Lot, Long> {
    Optional<Lot> findByNumber(Long number);
}
