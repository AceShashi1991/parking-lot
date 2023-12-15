package com.shashi.parkinglot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingLotRequest {

    private String name;

    private String address;

    private Integer noOfFloors;

    private Integer noOfSpotsPerFloor;

    private Integer noOfEntryGates;

    private Integer noOfExitGates;
}
