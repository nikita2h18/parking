package com.gmail.shabannikitka.parking.dto;

public class LotDto {

    public Long number;
    public String type;

    public LotDto() {
    }

    public LotDto(Long number, String type) {
        this.number = number;
        this.type = type;
    }
}
