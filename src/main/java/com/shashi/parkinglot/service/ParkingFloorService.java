package com.shashi.parkinglot.service;

import com.shashi.parkinglot.model.ParkingFloor;
import com.shashi.parkinglot.repository.ParkingFloorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParkingFloorService {

    @Autowired
    private ParkingFloorRepo parkingFloorRepo;

    public Optional<ParkingFloor> getParkingFloorById(Long id){
        return parkingFloorRepo.findById(id);
    }


    public ParkingFloor createParkingFloor(ParkingFloor parkingFloor){
        return parkingFloorRepo.save(parkingFloor);
    }

    public List<ParkingFloor> createParkingFloors(List<ParkingFloor> parkingFloors){
        return parkingFloorRepo.saveAll(parkingFloors);
    }
}
