package com.gmail.shabannikitka.parking.dto;

import com.gmail.shabannikitka.parking.entity.Renter;

public class RenterCredentialsDto {

    public Long id;
    public String login;
    public String hash;
    public Renter renter;

    public RenterCredentialsDto() {
    }

    public RenterCredentialsDto(Long id, String login, String hash, Renter renter) {
        this.id = id;
        this.login = login;
        this.hash = hash;
        this.renter = renter;
    }
}
