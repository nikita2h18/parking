package com.gmail.shabannikitka.parking.dto;


import java.time.LocalDate;

public class NewRentDto {
    public LotDto lotDto;
    public LocalDate rentStart;
    public LocalDate rentEnd;

    public NewRentDto() {
    }

    public NewRentDto(LotDto lotDto, LocalDate rentStart, LocalDate rentEnd) {
        this.lotDto = lotDto;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }
}
