package com.gmail.shabannikitka.parking.dto;

import java.util.Date;

public class LotStatusDto {

    public LotDto lot;
    public String status;
    public Date timeStamp;

    public LotStatusDto() {
    }

    public LotStatusDto(LotDto lot, String status, Date timeStamp) {
        this.lot = lot;
        this.status = status;
        this.timeStamp = timeStamp;
    }
}
