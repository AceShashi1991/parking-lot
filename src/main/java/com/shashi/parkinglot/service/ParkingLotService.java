package com.shashi.parkinglot.service;

import com.shashi.parkinglot.dto.ParkingLotRequest;
import com.shashi.parkinglot.model.*;
import com.shashi.parkinglot.model.gate.EntryGate;
import com.shashi.parkinglot.model.gate.ExitGate;
import com.shashi.parkinglot.repository.ParkingLotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ParkingLotService {

    @Autowired
    private ParkingLotRepo parkingLotRepo;

    @Autowired
    private EntryGateService entryGateService;

    @Autowired
    private ParkingFloorService parkingFloorService;

    @Autowired
    private ExitGateService exitGateService;

    @Autowired
    private DisplayBoardService displayBoardService;

    @Autowired
    private PaymentCounterService paymentCounterService;


    public Optional<ParkingLot> getParkingLotById(Long id){
        return parkingLotRepo.findById(id);
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot){
        return parkingLotRepo.save(parkingLot);
    }

    public ParkingLot createParkingLot(ParkingLotRequest request) {
        ParkingLot parkingLot = getParkingLot(request);
        exitGateService.createGates(parkingLot.getExitGate());
        entryGateService.createGates(parkingLot.getEntryGate());
        displayBoardService.creteDisplayBoard(parkingLot.getDisplayBoard());
        parkingFloorService.createParkingFloors(parkingLot.getParkingFloor());
        return parkingLotRepo.save(parkingLot);

    }

    public ParkingLot getParkingLot(ParkingLotRequest request){
        return  ParkingLot.builder()
                .name(request.getName())
                .address(request.getAddress())
                .parkingFloor(getParkingFloors(request.getNoOfFloors(), request.getNoOfSpotsPerFloor()))
                .entryGate(getEntryGates(request.getNoOfEntryGates()))
                .exitGate(getExitGates(request.getNoOfExitGates()))
                .displayBoard(DisplayBoard.builder()
                        .name("DB"+request.getName()).build())
                .build();
    }

    private List<ParkingSpot> getParkingSpots(Integer spots){
        return Collections.nCopies(spots,ParkingSpot.builder()
                .spotStatus(SpotStatus.AVAILABLE)
                        .vehicleType(VehicleType.MEDIUM)
                .build());
    }

    private List<ParkingFloor> getParkingFloors(Integer floors,Integer spots){
        ArrayList<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i=1;i<=floors;i++){
            parkingFloors.add(ParkingFloor.builder()
                            .parkingSpots(getParkingSpots(spots))
                            .floorNumber(i)
                            .paymentCounter(PaymentCounter.builder()
                                    .name("PC-"+i).build())
                            .displayBoard(DisplayBoard.builder()
                                    .name("DB-"+i).build())
                    .build());
        }
        return parkingFloors;
    }

    private List<EntryGate> getEntryGates(Integer noOfEntryGates){
        return Collections.nCopies(noOfEntryGates,EntryGate.builder()
                .displayBoard(DisplayBoard.builder()
                        .build()).build());
    }

    private List<ExitGate> getExitGates(Integer noOfExitGates){

        return Collections.nCopies(noOfExitGates,ExitGate.builder().build());
    }
}
