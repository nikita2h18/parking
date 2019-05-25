package com.gmail.shabannikitka.parking.dto;


import java.time.LocalDate;

public class NewRentDto {
    public Long number;
    public LocalDate rentStart;
    public LocalDate rentEnd;

    public NewRentDto() {
    }

    public NewRentDto(Long number, LocalDate rentStart, LocalDate rentEnd) {
        this.number = number;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }
}
