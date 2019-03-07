package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private BigInteger price;

    @ManyToOne
    @JoinColumn(name = "renter_id")
    private Renter renter;

    @OneToOne(mappedBy = "transaction")
    private Rent rent;

    public Transaction() {
    }

    public Transaction(String type, BigInteger price, Renter renter) {
        this.type = type;
        this.price = price;
        this.renter = renter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }
}
