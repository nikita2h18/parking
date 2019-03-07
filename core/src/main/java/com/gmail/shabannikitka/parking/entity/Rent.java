package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "rent")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "renter_id")
    private Renter renter;

    @OneToMany
    @JoinColumn(name = "lot_id")
    private List<Lot> lot;

    @Column(name = "rent_start")
    private Date rentStart;

    @Column(name = "rent_end")
    private Date rentEnd;

    @OneToOne
    @JoinColumn (name = "transaction_id")
    private Transaction transaction;

    public Rent() {
    }

    public Rent(Renter renter, List<Lot> lot, Date rentStart, Date rentEnd, Transaction transaction) {
        this.renter = renter;
        this.lot = lot;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
        this.transaction = transaction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    public List<Lot> getLot() {
        return lot;
    }

    public void setLot(List<Lot> lot) {
        this.lot = lot;
    }

    public Date getRentStart() {
        return rentStart;
    }

    public void setRentStart(Date rentStart) {
        this.rentStart = rentStart;
    }

    public Date getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(Date rentEnd) {
        this.rentEnd = rentEnd;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
}
