package com.gmail.shabannikitka.parking.dto;

import java.time.LocalDate;

public class NewLotDto {

    public Long number;
    public String type;
    public String status;
    public LocalDate timeStamp;

    public NewLotDto() {
    }

    public NewLotDto(Long number, String type, String status, LocalDate timeStamp) {
        this.number = number;
        this.type = type;
        this.status = status;
        this.timeStamp = timeStamp;
    }
}
