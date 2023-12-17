package com.shashi.parkinglot.model;


import com.shashi.parkinglot.model.gate.EntryGate;
import com.shashi.parkinglot.model.gate.ExitGate;
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
public class ParkingLot extends BaseEntity{

    private String name;

    private String address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "PARKING_LOT_PARKING_FLOOR ",
            joinColumns = {@JoinColumn(name = "PARKING_LOT_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "FLOOR_ID", referencedColumnName = "ID")})
    private List<ParkingFloor> parkingFloor = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "PARKING_LOT_ENTRY_GATE ",
            joinColumns = {@JoinColumn(name = "PARKING_LOT_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "ENTRY_GATE_ID", referencedColumnName = "ID")})
    private  List<EntryGate> entryGate = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "PARKING_LOT_EXIT_GATE ",
            joinColumns = {@JoinColumn(name = "PARKING_LOT_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "EXIT_GATE_ID", referencedColumnName = "ID")})
    private List<ExitGate> exitGate = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "display_board_id")
    private DisplayBoard displayBoard;


}
