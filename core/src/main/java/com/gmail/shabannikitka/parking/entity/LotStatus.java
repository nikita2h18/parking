package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "lot_status")
public class LotStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "time_stamp")
    private Date timeStamp;

    @OneToOne
    @JoinColumn (name = "lot_id")
    private Lot lot;

    public LotStatus() {
    }

    public LotStatus(String status, Date timeStamp, Lot lot) {
        this.status = status;
        this.timeStamp = timeStamp;
        this.lot = lot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }
}
