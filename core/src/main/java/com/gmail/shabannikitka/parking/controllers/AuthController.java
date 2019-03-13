package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.AuthenticationRenterDto;
import com.gmail.shabannikitka.parking.exception.AuthenticationException;
import com.gmail.shabannikitka.parking.exception.NoSuchEntityException;
import com.gmail.shabannikitka.parking.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping
    public String authenticate(@RequestBody AuthenticationRenterDto authenticationRenterDto) throws AuthenticationException, NoSuchEntityException{
        return authService.authenticate(authenticationRenterDto);
    }
}
