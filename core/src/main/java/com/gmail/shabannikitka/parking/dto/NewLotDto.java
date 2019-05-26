package com.gmail.shabannikitka.parking.dto;

import java.time.LocalDateTime;

public class NewLotDto {

    public Long number;
    public String type;
    public String status;
    public LocalDateTime timestamp;

    public NewLotDto() {
    }

    public NewLotDto(Long number, String type, String status, LocalDateTime timestamp) {
        this.number = number;
        this.type = type;
        this.status = status;
        this.timestamp = timestamp;
    }
}
