package com.gmail.shabannikitka.parking.services;

import com.gmail.shabannikitka.parking.dto.NewLotDto;
import com.gmail.shabannikitka.parking.entity.Lot;
import com.gmail.shabannikitka.parking.entity.LotStatus;
import com.gmail.shabannikitka.parking.repositories.LotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Optional;

@Service

public class LotService {

    @Autowired
    private final LotRepository lotRepository;

    public LotService(LotRepository lotRepository) {
        this.lotRepository = lotRepository;
    }

    public LotStatus getCurrentLotStatus(Lot lot) {
        return lot.getLotStatusList()
                .stream()
                .min((l1, l2) -> l2.getTimestamp().compareTo(l1.getTimestamp())).get();
    }

    public Optional<Lot> findFreeLotByNumber(Long number) {
        Optional<Lot> lotOptional = lotRepository.findByNumber(number);

        if (lotOptional.isPresent()) {
            if (getCurrentLotStatus(lotOptional.get()).getFree()) {
                return lotOptional;
            }
            return Optional.empty();
        }
        return Optional.empty();
    }

    public void createLot(NewLotDto newLotDto) throws Exception {

        if (lotRepository.findByNumber(newLotDto.number).isPresent()) {
            throw new Exception("Lot with this number already exist");
        }

        Lot lot = new Lot();

        lot.setType(newLotDto.type);
        lot.setNumber(newLotDto.number);
        lot.setLotStatusList(Collections.singletonList(new LotStatus(
                        true,
                        LocalDateTime.now(),
                        lot
                ))
        );

        lotRepository.save(lot);
    }

}
