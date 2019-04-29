package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name= "lot_status")
public class LotStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "free")
    private Boolean isFree;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn (name = "lot_id")
    private Lot lot;

    public LotStatus() {
    }

    public LotStatus(Boolean isFree, LocalDateTime timestamp, Lot lot) {
        this.isFree = isFree;
        this.timestamp = timestamp;
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

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }
}
