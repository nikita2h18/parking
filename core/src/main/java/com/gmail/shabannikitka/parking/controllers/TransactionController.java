package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.NewTransactionDto;
import com.gmail.shabannikitka.parking.entity.Rent;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.exception.DuplicationException;
import com.gmail.shabannikitka.parking.exception.NoSuchEntityException;
import com.gmail.shabannikitka.parking.exception.TransactionException;
import com.gmail.shabannikitka.parking.services.AuthService;
import com.gmail.shabannikitka.parking.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    private final TransactionService transactionService;

    @Autowired
    private final AuthService authService;


    public TransactionController(TransactionService transactionService, AuthService authService) {
        this.transactionService = transactionService;
        this.authService = authService;
    }

    @PostMapping("create")
    public void transactionCreate(@RequestHeader("token") String token, @RequestBody NewTransactionDto transactionDto) throws TransactionException, NoSuchEntityException, DuplicationException {
        Renter renter = authService.validate(token);
        Rent rent = new Rent();
        transactionService.transactionCreate(rent);
    }
}
