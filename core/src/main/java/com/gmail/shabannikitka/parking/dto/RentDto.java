package com.gmail.shabannikitka.parking.dto;

import java.util.Date;

public class RentDto {

    public Long id;
    public RenterDto renter;
    public LotDto lot;
    public Date rentStart;
    public Date rentEnd;
    public TransactionDto transaction;

    public RentDto() {
    }

    public RentDto(Long id, RenterDto renter, LotDto lot, Date rentStart, Date rentEnd, TransactionDto transaction) {
        this.id = id;
        this.renter = renter;
        this.lot = lot;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.transaction = transaction;
    }
}
