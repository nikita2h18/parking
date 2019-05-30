package com.gmail.shabannikitka.parking.dto;

import javax.validation.constraints.NotEmpty;

public class RegisterRenterDto {

    @NotEmpty(message = "Shouldn't be empty")
    public String login;
    @NotEmpty(message = "Shouldn't be empty")
    public String password;
    @NotEmpty(message = "Shouldn't be empty")
    public String firstName;
    @NotEmpty(message = "Shouldn't be empty")
    public String secondName;
    @NotEmpty(message = "Shouldn't be empty")
    public String patronymic;
    @NotEmpty(message = "Shouldn't be empty")
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
