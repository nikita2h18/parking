package com.gmail.shabannikitka.parking.dto;


public class RenterInfoDto {

    public Long id;
    public String firstName;
    public String secondName;
    public String patronymic;
    public String passportNumber;
    public RenterDto renter;

    public RenterInfoDto() {
    }

    public RenterInfoDto(String firstName, String secondName, String patronymic, String passportNumber, RenterDto renter) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.passportNumber = passportNumber;
        this.renter = renter;
    }
}
