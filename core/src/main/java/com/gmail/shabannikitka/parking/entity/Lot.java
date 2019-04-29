package com.gmail.shabannikitka.parking.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name= "lot")
public class Lot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private Long number;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "lot", cascade = CascadeType.ALL)
    private List<LotStatus> lotStatusList;

    public Lot() {
    }

    public Lot(List<LotStatus> lotStatusList) {
        this.lotStatusList = lotStatusList;
    }

    public Lot(Long number, String type, List<LotStatus> lotStatusList) {
        this.number = number;
        this.type = type;
        this.lotStatusList = lotStatusList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<LotStatus> getLotStatusList() {
        return lotStatusList;
    }

    public void setLotStatusList(List<LotStatus> lotStatusList) {
        this.lotStatusList = lotStatusList;
    }
}
