package com.gmail.shabannikitka.parking.repositories;

import com.gmail.shabannikitka.parking.entity.Renter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends CrudRepository<Renter, Long> {
    public void findByLogin(String login);
}
