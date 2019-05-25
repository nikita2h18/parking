package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.NewRentDto;
import com.gmail.shabannikitka.parking.dto.NewTransactionDto;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.Token;
import com.gmail.shabannikitka.parking.exception.DuplicationException;
import com.gmail.shabannikitka.parking.exception.NoSuchEntityException;
import com.gmail.shabannikitka.parking.services.AuthService;
import com.gmail.shabannikitka.parking.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rent")
public class RentController {

    private final RentService rentService;
    private final AuthService authService;

    @Autowired
    public RentController(RentService rentService, AuthService authService) {
        this.rentService = rentService;
        this.authService = authService;
    }

    @PostMapping("add")
    public void rentAdd(@RequestHeader("token") String token, @RequestBody NewRentDto newRentDto) throws NoSuchEntityException, DuplicationException {
        Renter renter = authService.validate(token);

        rentService.rentAdd(renter, newRentDto);
    }
}
