package com.gmail.shabannikitka.parking.controllers;

import com.gmail.shabannikitka.parking.dto.NewLotDto;
import com.gmail.shabannikitka.parking.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("lot")
public class LotController {

    @Autowired
    private final LotService lotService;

    public LotController(LotService lotService) {
        this.lotService = lotService;
    }

    @PostMapping("create")
    public void createLot(@RequestHeader("token") String token, @RequestBody NewLotDto newLotDto) throws Exception {


        lotService.createLot(newLotDto);
    }
}
