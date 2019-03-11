package com.gmail.shabannikitka.parking.dto;

public class RenterDto {

    public Long id;
    public RenterInfoDto renterInfo;
    public RenterCredentialsDto renterCredentials;
    public RentDto rent;

    public RenterDto() {
    }

    public RenterDto(Long id, RenterInfoDto renterInfo, RenterCredentialsDto renterCredentials, RentDto rent) {
        this.id = id;
        this.renterInfo = renterInfo;
        this.renterCredentials = renterCredentials;
        this.rent = rent;
    }
}
