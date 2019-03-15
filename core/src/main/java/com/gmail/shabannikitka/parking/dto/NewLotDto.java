package com.gmail.shabannikitka.parking.dto;

import java.util.Date;

public class NewLotDto {

    public Long number;
    public String type;
    public String status;
    public Date timeStamp;

    public NewLotDto() {
    }

    public NewLotDto(Long number, String type, String status, Date timeStamp) {
        this.number = number;
        this.type = type;
        this.status = status;
        this.timeStamp = timeStamp;
    }
}
