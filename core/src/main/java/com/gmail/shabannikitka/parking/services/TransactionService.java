package com.gmail.shabannikitka.parking.services;

import com.gmail.shabannikitka.parking.dto.NewTransactionDto;
import com.gmail.shabannikitka.parking.dto.TransactionDto;
import com.gmail.shabannikitka.parking.entity.Rent;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.Transaction;
import com.gmail.shabannikitka.parking.exception.DuplicationException;
import com.gmail.shabannikitka.parking.repositories.RenterRepository;
import com.gmail.shabannikitka.parking.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TransactionService {

    @Autowired
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void transactionCreate(Renter renter, Rent rent, NewTransactionDto newTransactionDto) throws DuplicationException {
        if (transactionRepository.findAllByRentAndRenter(rent, renter) != null) {
            throw new DuplicationException("such transaction already exist");
        }

        Transaction transaction = transactionRepository.save(
                new Transaction(
                        newTransactionDto.type,
                        newTransactionDto.price,
                        renter,
                        rent
                )
        );

        transactionRepository.save(transaction);
    }
}
