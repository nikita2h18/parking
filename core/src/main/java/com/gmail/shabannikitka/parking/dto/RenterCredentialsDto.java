package com.gmail.shabannikitka.parking.dto;

import com.gmail.shabannikitka.parking.entity.Renter;

public class RenterCredentialsDto {

    public String login;

    public RenterCredentialsDto() {
    }

    public RenterCredentialsDto(String login) {
        this.login = login;
    }
}
