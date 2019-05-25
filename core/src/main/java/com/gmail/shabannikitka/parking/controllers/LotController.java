package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.NewLotDto;
import com.gmail.shabannikitka.parking.entity.Renter;
import com.gmail.shabannikitka.parking.services.AuthService;
import com.gmail.shabannikitka.parking.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lot")
public class LotController {

    private final LotService lotService;
    private final AuthService authService;

    @Autowired
    public LotController(LotService lotService, AuthService authService) {
        this.lotService = lotService;
        this.authService = authService;
    }

    @PostMapping(name = "create")
    public void createLot(@RequestHeader("token") String token, @RequestBody NewLotDto newLotDto) throws Exception {
        Renter renter = authService.validate(token);

        lotService.createLot(newLotDto);
    }
}
