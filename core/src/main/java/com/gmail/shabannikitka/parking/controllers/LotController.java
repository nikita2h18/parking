package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.LotDto;
import com.gmail.shabannikitka.parking.dto.NewLotDto;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.exception.NoSuchEntityException;
import com.gmail.shabannikitka.parking.services.AuthService;
import com.gmail.shabannikitka.parking.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lot")
public class LotController {

    @Autowired
    private final LotService lotService;

    @Autowired
    private final AuthService authService;

    public LotController(LotService lotService, AuthService authService) {
        this.lotService = lotService;
        this.authService = authService;
    }

    @PostMapping("create")
    public void createLot(@RequestHeader("token") String token, @RequestBody NewLotDto newLotDto) throws Exception {
        lotService.createLot(newLotDto);
    }

    @GetMapping("lots")
    public List<LotDto> getAll(@RequestHeader("token") String token) throws NoSuchEntityException {
        Renter renter = authService.validate(token);
        return lotService.all();
    }
}
