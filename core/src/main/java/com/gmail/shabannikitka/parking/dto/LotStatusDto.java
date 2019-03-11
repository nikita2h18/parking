package com.gmail.shabannikitka.parking.dto;

import java.util.Date;

public class LotStatusDto {

    public Long id;
    public LotDto lot;
    public String status;
    public Date timeStamp;

    public LotStatusDto() {
    }

    public LotStatusDto(Long id, LotDto lot, String status, Date timeStamp) {
        this.id = id;
        this.lot = lot;
        this.status = status;
        this.timeStamp = timeStamp;
    }
}
