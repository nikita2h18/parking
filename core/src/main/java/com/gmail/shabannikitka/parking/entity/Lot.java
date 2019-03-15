package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@Table(name= "lot")
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private Long number;

    @Column(name = "type")
    private String type;

    @OneToOne(mappedBy = "lot", cascade = CascadeType.ALL)
    private LotStatus lotStatus;

    public Lot() {
    }

    public Lot(Long number, String type, LotStatus lotStatus) {
        this.number = number;
        this.type = type;
        this.lotStatus = lotStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LotStatus getLotStatus() {
        return lotStatus;
    }

    public void setLotStatus(LotStatus lotStatus) {
        this.lotStatus = lotStatus;
    }
}
