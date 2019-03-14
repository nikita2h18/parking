package com.gmail.shabannikitka.parking.dto;

public class RegisterRenterDto {

    public String login;
    public String password;
    public String firstName;
    public String secondName;
    public String patronymic;
    public String passportNumber;

    public RegisterRenterDto() {
    }

    public RegisterRenterDto(String login, String password, String firstName, String secondName, String patronymic, String passportNumber) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.passportNumber = passportNumber;
    }
}
