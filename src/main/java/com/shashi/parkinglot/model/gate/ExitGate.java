package com.shashi.parkinglot.model.gate;

import com.shashi.parkinglot.model.ParkingLot;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExitGate extends Gate{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_lot_id")
    private ParkingLot parkingLot;
}
