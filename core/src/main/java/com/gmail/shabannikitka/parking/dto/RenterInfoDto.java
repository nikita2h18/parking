package com.gmail.shabannikitka.parking.dto;


public class RenterInfoDto {

    public String firstName;
    public String secondName;
    public String patronymic;
    public String passportNumber;

    public RenterInfoDto() {
    }

    public RenterInfoDto(String firstName, String secondName, String patronymic, String passportNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.passportNumber = passportNumber;
    }
}
