package com.gmail.shabannikitka.parking.dto;

import java.time.LocalDateTime;

public class LotDto {

    public Long number;
    public String type;
    public Boolean isFree;
    public LocalDateTime timestamp;


    public LotDto() {
    }

    public LotDto(Long number, String type) {
        this.number = number;
        this.type = type;
    }

    public LotDto(Long number, String type, Boolean isFree) {
        this.number = number;
        this.type = type;
        this.isFree = isFree;
    }

    public LotDto(Long number, String type, Boolean isFree, LocalDateTime timestamp) {
        this.number = number;
        this.type = type;
        this.isFree = isFree;
        this.timestamp = timestamp;
    }
}
