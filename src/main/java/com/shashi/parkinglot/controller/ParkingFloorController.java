package com.shashi.parkinglot.controller;

import com.shashi.parkinglot.model.ParkingFloor;
import com.shashi.parkinglot.service.ParkingFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/parking-lot/parking-floor/")
public class ParkingFloorController {

    @Autowired
    private ParkingFloorService parkingFloorService;

    @GetMapping("{id}")
    public ParkingFloor getParkingFloor(@PathVariable Long id){
        return parkingFloorService.getParkingFloorById(id).orElseThrow();
    }

    @PostMapping
    public ParkingFloor getParkingFloor(@RequestBody ParkingFloor parkingFloor){
        return parkingFloorService.createParkingFloor(parkingFloor);
    }
}
