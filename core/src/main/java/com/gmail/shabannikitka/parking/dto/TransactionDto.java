package com.gmail.shabannikitka.parking.dto;

public class TransactionDto {

    public Long id;
    public String type;
    public Long price;
    public RenterDto renter;
    public RentDto rent;

    public TransactionDto() {
    }

    public TransactionDto(Long id, String type, Long price, RenterDto renter, RentDto rent) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.renter = renter;
        this.rent = rent;
    }
}
