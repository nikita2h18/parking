package com.gmail.shabannikitka.parking.dto;

public class TransactionDto {

    public Long price;
    public RentDto rent;

    public TransactionDto() {
    }

    public TransactionDto(Long price, RentDto rent) {
        this.price = price;
        this.rent = rent;
    }
}
