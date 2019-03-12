package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;

@Entity
@Table(name= "renter_credentials")
public class RenterCredentials {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "hash")
    private String hash;

    @OneToOne
    @JoinColumn (name = "renter_id")
    private Renter renter;

    public RenterCredentials() {
    }

    public RenterCredentials(Renter renter) {
        this.renter = renter;
    }

    public RenterCredentials(Renter renter, String login, String hash) {
        this.login = login;
        this.hash = hash;
        this.renter = renter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }
}
