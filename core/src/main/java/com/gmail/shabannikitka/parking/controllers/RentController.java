package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.NewRentDto;
import com.gmail.shabannikitka.parking.dto.NewTransactionDto;
import com.gmail.shabannikitka.parking.dto.RentDto;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.Token;
import com.gmail.shabannikitka.parking.exception.DuplicationException;
import com.gmail.shabannikitka.parking.exception.NoSuchEntityException;
import com.gmail.shabannikitka.parking.services.AuthService;
import com.gmail.shabannikitka.parking.services.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rent")
public class RentController {
    @Autowired
    private final RentService rentService;

    @Autowired
    private final AuthService authService;

    public RentController(RentService rentService, AuthService authService) {
        this.rentService = rentService;
        this.authService = authService;
    }

    @PostMapping("add")
    public void rentAdd(@RequestHeader("token") String token, @RequestBody NewRentDto newRentDto) throws NoSuchEntityException, DuplicationException {
        Renter renter = authService.validate(token);

        rentService.rentAdd(renter, newRentDto);
    }

    @GetMapping("rents")
    public List<RentDto> getAll(@RequestHeader("token") String token) throws NoSuchEntityException {
        Renter renter = authService.validate(token);
        return rentService.all(renter);
    }

}
