package com.gmail.shabannikitka.parking.dto;

public class RenterDto {

    public RenterInfoDto renterInfo;
    public RenterCredentialsDto renterCredentials;
    public RentDto rent;

    public RenterDto() {
    }

    public RenterDto(RenterInfoDto renterInfo, RenterCredentialsDto renterCredentials, RentDto rent) {
        this.renterInfo = renterInfo;
        this.renterCredentials = renterCredentials;
        this.rent = rent;
    }
}
