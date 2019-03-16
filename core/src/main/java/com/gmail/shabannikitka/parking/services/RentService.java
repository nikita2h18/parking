package com.gmail.shabannikitka.parking.services;

import com.gmail.shabannikitka.parking.dto.NewRentDto;
import com.gmail.shabannikitka.parking.repositories.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RentService {

    @Autowired
    private final RentRepository rentRepository;

    public RentService(RentRepository rentRepository) {
        this.rentRepository = rentRepository;
    }

    public void rentAdd(NewRentDto newRentDto) {

    }
}
