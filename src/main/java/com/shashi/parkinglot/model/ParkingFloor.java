package com.shashi.parkinglot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingFloor extends BaseEntity{

    private Integer floorNumber;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "parkingFloor")
    private List<ParkingSpot> parkingSpotList = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "display_board_id")
    private DisplayBoard displayBoard;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_counter_id")
    private PaymentCounter paymentCounter;

}
