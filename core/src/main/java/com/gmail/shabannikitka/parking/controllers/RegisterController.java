package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.RegisterRenterDto;
import com.gmail.shabannikitka.parking.exeption.RegistrationException;
import com.gmail.shabannikitka.parking.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;


    @PostMapping
    public void register(@RequestBody RegisterRenterDto registerRenterDto) throws RegistrationException {
        registerService.register(registerRenterDto);
    }

}
