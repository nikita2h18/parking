package com.gmail.shabannikitka.parking.dto;

public class NewTransactionDto {
    public String type;
    public Long price;
    public RenterDto renter;
    public RentDto rent;

    public NewTransactionDto() {
    }

    public NewTransactionDto(String type, Long price, RenterDto renter, RentDto rent) {
        this.type = type;
        this.price = price;
        this.renter = renter;
        this.rent = rent;
    }
}
