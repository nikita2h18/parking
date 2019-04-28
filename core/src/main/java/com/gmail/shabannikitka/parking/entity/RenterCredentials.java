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

    @Column(name = "password")
    private String password;

    @OneToOne
    @JoinColumn (name = "renter_id")
    private Renter renter;

    public RenterCredentials() {
    }

    public RenterCredentials(Renter renter, String login, String password) {
        this.renter = renter;
        this.login = login;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }
}
