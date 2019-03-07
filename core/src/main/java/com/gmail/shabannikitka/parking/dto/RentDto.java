package com.gmail.shabannikitka.parking.dto;

import com.gmail.shabannikitka.parking.entity.Lot;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.entity.Transaction;

import java.util.Date;

public class RentDto {

    public Long id;
    public Renter renter;
    public Lot lot;
    public Date rentStart;
    public Date rentEnd;
    public Transaction transaction;

    public RentDto() {
    }

    public RentDto(Long id, Renter renter, Lot lot, Date rentStart, Date rentEnd, Transaction transaction) {
        this.id = id;
        this.renter = renter;
        this.lot = lot;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.transaction = transaction;
    }
}
