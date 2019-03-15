package com.gmail.shabannikitka.parking.services;

import com.gmail.shabannikitka.parking.dto.NewLotDto;
import com.gmail.shabannikitka.parking.entity.Lot;
import com.gmail.shabannikitka.parking.entity.LotStatus;
import com.gmail.shabannikitka.parking.repositories.LotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LotService {

    @Autowired
    private final LotRepository lotRepository;

    public LotService(LotRepository lotRepository) {
        this.lotRepository = lotRepository;
    }

    public void createLot(NewLotDto newLotDto) throws Exception {

        if (lotRepository.findByNumber(newLotDto.number).isPresent()) {
            throw new Exception("Lot with this number already exist");
        }

        Lot lot = new Lot();

        lot.setType(newLotDto.type);
        lot.setNumber(newLotDto.number);
        lot.setLotStatus( new LotStatus(
                newLotDto.status,
                newLotDto.timeStamp,
                lot
                )
        );

        lotRepository.save(lot);
    }

}
