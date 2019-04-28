package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.time.LocalDate;

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

    @OneToOne
    @JoinColumn(name = "lot_id")
    private Lot lot;

    @Column(name = "rent_start")
    private LocalDate rentStart;

    @Column(name = "rent_end")
    private LocalDate rentEnd;



    public Rent() {
    }

    public Rent(Renter renter, Lot lot, LocalDate rentStart, LocalDate rentEnd) {
        this.renter = renter;
        this.lot = lot;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
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

    public Lot getLot() {
        return lot;
    }

    public void setLot(Lot lot) {
        this.lot = lot;
    }

    public LocalDate getRentStart() {
        return rentStart;
    }

    public void setRentStart(LocalDate rentStart) {
        this.rentStart = rentStart;
    }

    public LocalDate getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(LocalDate rentEnd) {
        this.rentEnd = rentEnd;
    }
}
