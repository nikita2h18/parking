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
    private BigInteger number;

    @Column(name = "type")
    private String type;

    public Lot() {
    }

    public Lot(BigInteger number, String type) {
        this.number = number;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getNumber() {
        return number;
    }

    public void setNumber(BigInteger number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}