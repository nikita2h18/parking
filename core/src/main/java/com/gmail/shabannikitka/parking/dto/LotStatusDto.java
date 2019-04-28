package com.gmail.shabannikitka.parking.dto;


import java.time.LocalDate;

public class LotStatusDto {

    public Boolean free;
    public LocalDate timeStamp;

    public LotStatusDto() {
    }

    public LotStatusDto(Boolean free, LocalDate timeStamp) {
        this.free = free;
        this.timeStamp = timeStamp;
    }
}
