package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name= "renter")
public class Renter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "renter")
    private RenterInfo renterInfo;

    @OneToOne(mappedBy = "renter")
    private RenterCredentials renterCredentials;

    public Renter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
