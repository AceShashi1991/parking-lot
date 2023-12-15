package com.shashi.parkinglot.controller;

import com.shashi.parkinglot.dto.ParkingLotRequest;
import com.shashi.parkinglot.model.ParkingLot;
import com.shashi.parkinglot.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/parking-lot/")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("{id}")
    public ParkingLot getParkingLot(@PathVariable Long id) {
        return parkingLotService.getParkingLotById(id).orElseThrow();
    }

    @PostMapping
    public ParkingLot createParkingLot(@RequestBody ParkingLotRequest request) throws InvalidNoOfFloorsException {

        validate(request);
        return transform(request);
    }

    private ParkingLot transform(ParkingLotRequest request) {
        return parkingLotService.createParkingLot(request);
    }

    private void validate(ParkingLotRequest request) throws InvalidNoOfFloorsException {
        if(request.getNoOfFloors() < 0){
            throw new InvalidNoOfFloorsException("Invalid no of floors");
        }
    }


}
