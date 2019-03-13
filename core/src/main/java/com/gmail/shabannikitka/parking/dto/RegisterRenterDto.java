package com.gmail.shabannikitka.parking.dto;

public class RegisterRenterDto {

    public String login;
    public String hash;
    public String firstName;
    public String secondName;
    public String patronymic;
    public String passportNumber;

    public RegisterRenterDto() {
    }

    public RegisterRenterDto(String login, String hash, String firstName, String secondName, String patronymic, String passportNumber) {
        this.login = login;
        this.hash = hash;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.passportNumber = passportNumber;
    }
}
