package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "lot_status")
public class LotStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "free")
    private Boolean isFree;

    @Column(name = "time_stamp")
    private LocalDate timeStamp;

    @ManyToOne
    @JoinColumn (name = "lot_id")
    private Lot lot;

    public LotStatus() {
    }

    public LotStatus(Boolean isFree, LocalDate timeStamp, Lot lot) {
        this.isFree = isFree;
        this.timeStamp = timeStamp;
        this.lot = lot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }
}
