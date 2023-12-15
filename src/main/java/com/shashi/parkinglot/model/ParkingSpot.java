package com.shashi.parkinglot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingSpot extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "parking_floor_id")
    private ParkingFloor parkingFloor;

    @Enumerated(EnumType.ORDINAL)
    private VehicleType vehicleType;

    @Enumerated(EnumType.ORDINAL)
    private SpotStatus spotStatus;

}
