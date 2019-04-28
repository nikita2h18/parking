package com.gmail.shabannikitka.parking.services;

import com.gmail.shabannikitka.parking.dto.NewRentDto;
import com.gmail.shabannikitka.parking.entity.Lot;
import com.gmail.shabannikitka.parking.entity.LotStatus;
import com.gmail.shabannikitka.parking.entity.Rent;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.exception.DuplicationException;
import com.gmail.shabannikitka.parking.repositories.LotRepository;
import com.gmail.shabannikitka.parking.repositories.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.stream.Collectors;

@Service
@Transactional
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

        if (!lotService.findFreeLotByNumber(newRentDto.lotDto.number).isPresent()) {
            throw new DuplicationException("such lot is already not empty");
        }

        Rent rent = new Rent(
                renter,
                lotRepository.findByNumber(newRentDto.lotDto.number).get(),
                newRentDto.rentStart,
                newRentDto.rentEnd
        );

        LotStatus lotStatus = new LotStatus(
                false,
                newRentDto.lotDto.lotStatus.timeStamp,
                lotRepository.findByNumber(newRentDto.lotDto.number).get()
        );

        lotService.findFreeLotByNumber(newRentDto.lotDto.number).
                get().
                setLotStatus(lotStatus);


        rentRepository.save(rent);
        transactionService.transactionCreate(rent);
    }


}
