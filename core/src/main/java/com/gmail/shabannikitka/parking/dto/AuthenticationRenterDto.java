package com.gmail.shabannikitka.parking.dto;

public class AuthenticationRenterDto {

    public String login;

    public String password;

    public AuthenticationRenterDto() {
    }

    public AuthenticationRenterDto(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
