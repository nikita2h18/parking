package com.gmail.shabannikitka.parking.dto;

public class RegisterRenterDto {

    public String login;
    public String password;

    public RegisterRenterDto() {
    }

    public RegisterRenterDto(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
