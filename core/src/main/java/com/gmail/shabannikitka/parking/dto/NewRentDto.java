package com.gmail.shabannikitka.parking.dto;

import java.util.Date;

public class NewRentDto {
    public RenterDto renter;
    public LotDto lot;
    public Date rentStart;
    public Date rentEnd;
    public TransactionDto transaction;

    public NewRentDto() {
    }

    public NewRentDto(RenterDto renter, LotDto lot, Date rentStart, Date rentEnd, TransactionDto transaction) {
        this.renter = renter;
        this.lot = lot;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.transaction = transaction;
    }
}
