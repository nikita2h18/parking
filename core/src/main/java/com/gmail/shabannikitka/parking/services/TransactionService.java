package com.gmail.shabannikitka.parking.services;

import com.gmail.shabannikitka.parking.dto.NewTransactionDto;
import com.gmail.shabannikitka.parking.entity.Rent;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.Transaction;
import com.gmail.shabannikitka.parking.exception.DuplicationException;
import com.gmail.shabannikitka.parking.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

public class TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void transactionCreate(Rent rent) throws DuplicationException {
        if (transactionRepository.findAllByRent(rent).isPresent()) {
            throw new DuplicationException("such transaction already exist");
        }

        Transaction transaction = transactionRepository.save(
                new Transaction(
                        0L,
                        rent
                )
        );

        transactionRepository.save(transaction);
    }
}
