package com.shashi.parkinglot.service;

import com.shashi.parkinglot.repository.ParkingLotRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ParkingLotServiceTest {



    @Mock
    private ParkingLotRepo parkingLotRepo;
    @InjectMocks
    private ParkingLotService parkingLotService;


    @Test
    void testCreateParkingLot() {
    }
}