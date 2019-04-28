package com.gmail.shabannikitka.parking.entity;

import com.gmail.shabannikitka.parking.dto.RentDto;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "price")
    private Long price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rent_id")
    private Rent rent;

    public Transaction() {
    }

    public Transaction(Long price, Rent rent) {
        this.price = price;
        this.rent = rent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
