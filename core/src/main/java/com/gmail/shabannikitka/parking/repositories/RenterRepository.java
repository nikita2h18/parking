package com.gmail.shabannikitka.parking.repositories;

import com.gmail.shabannikitka.parking.entity.Renter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends CrudRepository<Renter, Long> {

    @Query("select r from Renter r join r.renterCredentials c where c.login = :login")
    Renter findByLogin(@Param("login") String login);
}
