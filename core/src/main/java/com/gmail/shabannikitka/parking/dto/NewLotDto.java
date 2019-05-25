package com.gmail.shabannikitka.parking.dto;

import java.time.LocalDateTime;

public class NewLotDto {

    public Long number;
    public String type;
    public Boolean free;
    public LocalDateTime timestamp;

    public NewLotDto() {
    }

    public NewLotDto(Long number, String type, Boolean free, LocalDateTime timestamp) {
        this.number = number;
        this.type = type;
        this.free = free;
        this.timestamp = timestamp;
    }
}
