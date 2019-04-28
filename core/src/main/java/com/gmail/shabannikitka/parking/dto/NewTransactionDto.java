package com.gmail.shabannikitka.parking.dto;

public class NewTransactionDto {
    public Long price;
    public RentDto rent;

    public NewTransactionDto() {
    }

    public NewTransactionDto(Long price, RentDto rent) {
        this.price = price;
        this.rent = rent;
    }
}
