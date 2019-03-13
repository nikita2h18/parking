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

    @OneToOne(mappedBy = "renter", cascade = CascadeType.ALL)
    private RenterInfo renterInfo;

    @OneToOne(mappedBy = "renter", cascade = CascadeType.ALL)
    private RenterCredentials renterCredentials;

    public Renter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RenterInfo getRenterInfo() {
        return renterInfo;
    }

    public void setRenterInfo(RenterInfo renterInfo) {
        this.renterInfo = renterInfo;
    }

    public RenterCredentials getRenterCredentials() {
        return renterCredentials;
    }

    public void setRenterCredentials(RenterCredentials renterCredentials) {
        this.renterCredentials = renterCredentials;
    }
}
