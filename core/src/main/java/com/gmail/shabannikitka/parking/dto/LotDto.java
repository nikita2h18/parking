package com.gmail.shabannikitka.parking.dto;

public class LotDto {

    public Long id;
    public Long number;
    public String type;
    public LotStatusDto lotStatus;

    public LotDto() {
    }

    public LotDto(Long id, Long number, String type, LotStatusDto lotStatus) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.lotStatus = lotStatus;
    }
}
