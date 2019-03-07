package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;

@Entity
@Table(name= "renter_info")
public class RenterInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column (name = "patronymic")
    private String patronymic;

    @Column (name = "passport_number")
    private String passport_number;

    @OneToOne
    @JoinColumn (name = "renter_id")
    private Renter renter;

    public RenterInfo() {
    }

    public RenterInfo(String firstName, String lastName, String patronymic, String passport_number, Renter renter) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.passport_number = passport_number;
        this.renter = renter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronimyc() {
        return patronymic;
    }

    public void setPatronimyc(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassport_number() {
        return passport_number;
    }

    public void setPassport_number(String passport_number) {
        this.passport_number = passport_number;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }
}
