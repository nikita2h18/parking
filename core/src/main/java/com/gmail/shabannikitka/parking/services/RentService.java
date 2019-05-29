package com.gmail.shabannikitka.parking.services;

import ch.qos.logback.core.pattern.Converter;
import com.gmail.shabannikitka.parking.dto.LotDto;
import com.gmail.shabannikitka.parking.dto.LotStatusDto;
import com.gmail.shabannikitka.parking.dto.NewRentDto;
import com.gmail.shabannikitka.parking.dto.RentDto;
import com.gmail.shabannikitka.parking.entity.LotStatus;
import com.gmail.shabannikitka.parking.entity.Rent;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.exception.DuplicationException;
import com.gmail.shabannikitka.parking.repositories.LotRepository;
import com.gmail.shabannikitka.parking.repositories.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RentService {

    private final RentRepository rentRepository;

    private final LotRepository lotRepository;

    private final LotService lotService;

    private final TransactionService transactionService;

    @Autowired
    public RentService(RentRepository rentRepository, LotRepository lotRepository, LotService lotService, TransactionService transactionService) {
        this.rentRepository = rentRepository;
        this.lotRepository = lotRepository;
        this.lotService = lotService;
        this.transactionService = transactionService;
    }


    public void rentAdd(Renter renter, NewRentDto newRentDto) throws DuplicationException {

        if (!lotService.findFreeLotByNumber(newRentDto.number).isPresent()) {
            throw new DuplicationException("such lot is already not empty");
        }

        Rent rent = new Rent(
                renter,
                lotRepository.findByNumber(newRentDto.number).get(),
                newRentDto.rentStart,
                newRentDto.rentEnd
        );

        LotStatus lotStatus = new LotStatus(
                false,
                LocalDateTime.now(),
                lotRepository.findByNumber(newRentDto.number).get()
        );

        lotService.findFreeLotByNumber(newRentDto.number).
                get()
                .setLotStatusList(Collections.singletonList(lotStatus));


        rentRepository.save(rent);
        transactionService.transactionCreate(rent);
    }


    public List<RentDto> all(Renter renter) {

            return rentRepository.findAllByRenter(renter)
                    .stream()
                    .map(r -> new RentDto(
                            renter.getRenterInfo().getfirstName(),
                            renter.getRenterInfo().getlastName(),
                            renter.getRenterInfo().getPatronimyc(),
                            r.getLot().getNumber(),
                            r.getRentStart(),
                            r.getRentEnd()
                    ))
                    .collect(Collectors.toList());
    }
}
