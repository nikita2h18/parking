package com.gmail.shabannikitka.parking.dto;


import java.time.LocalDateTime;

public class LotStatusDto {

    public Boolean free;
    public LocalDateTime timestamp;

    public LotStatusDto() {
    }

    public LotStatusDto(Boolean free, LocalDateTime timestamp) {
        this.free = free;
        this.timestamp = timestamp;
    }
}
