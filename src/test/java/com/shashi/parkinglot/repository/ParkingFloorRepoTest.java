package com.shashi.parkinglot.repository;

import com.shashi.parkinglot.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class ParkingFloorRepoTest {

    @Autowired
    private ParkingFloorRepo parkingFloorRepo;

    @Test
    public void saveTest(){
        PaymentCounter paymentCounter = PaymentCounter.builder().build();
        List<ParkingSpot> spotList = List.of(ParkingSpot.builder()
        .vehicleType(VehicleType.SMALL)
        .spotStatus(SpotStatus.AVAILABLE).build()
                ,ParkingSpot.builder().vehicleType(VehicleType.SMALL)
                        .spotStatus(SpotStatus.AVAILABLE).build());
        ParkingFloor parkingFloor = ParkingFloor.builder()
                .floorNumber(1)
                .parkingSpots(spotList)
                .displayBoard(DisplayBoard.builder().build())
                .paymentCounter(paymentCounter)
                .build();

       parkingFloor = parkingFloorRepo.save(parkingFloor);

        assertNotNull(parkingFloor);
        assertNotNull(parkingFloor.getId());
        assertEquals(parkingFloor.getFloorNumber(),1);
        assertNotNull(parkingFloor.getDisplayBoard());
        assertNotNull(parkingFloor.getPaymentCounter());
        assertEquals(2,parkingFloor.getParkingSpots().size());
    }

}