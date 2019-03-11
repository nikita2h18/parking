package com.gmail.shabannikitka.parking.dto;

import java.util.Date;

public class RentDto {

    public RenterDto renter;
    public LotDto lot;
    public Date rentStart;
    public Date rentEnd;
    public TransactionDto transaction;

    public RentDto() {
    }

    public RentDto(RenterDto renter, LotDto lot, Date rentStart, Date rentEnd, TransactionDto transaction) {
        this.renter = renter;
        this.lot = lot;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.transaction = transaction;
    }
}
