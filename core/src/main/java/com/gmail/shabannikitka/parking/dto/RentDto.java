package com.gmail.shabannikitka.parking.dto;


import java.time.LocalDate;

public class RentDto {

    public LotDto lotDto;
    public LocalDate rentStart;
    public LocalDate rentEnd;

    public RentDto() {
    }

    public RentDto(LotDto lotDto, LocalDate rentStart, LocalDate rentEnd) {
        this.lotDto = lotDto;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }
}
