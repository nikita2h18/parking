package com.gmail.shabannikitka.parking.dto;

public class RegisterRenterDto {

    public String login;
    public String hash;

    public RegisterRenterDto() {
    }

    public RegisterRenterDto(String login, String hash) {
        this.login = login;
        this.hash = hash;
    }
}
