package com.gmail.shabannikitka.parking.dto;


import java.time.LocalDate;

public class RentDto {

    public String name;
    public String lastName;
    public String patronymic;
    public Long number;
    public LocalDate rentStart;
    public LocalDate rentEnd;

    public RentDto() {
    }

    public RentDto(Long number, LocalDate rentStart, LocalDate rentEnd) {
        this.number = number;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }

    public RentDto(String name, String lastName, String patronymic, Long number, LocalDate rentStart, LocalDate rentEnd) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.number = number;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }
}
