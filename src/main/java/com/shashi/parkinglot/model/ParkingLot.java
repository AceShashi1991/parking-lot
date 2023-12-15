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
    private List<ParkingFloor> parkingFloorList = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private  List<EntryGate> entryGate = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExitGate> exitGate = new ArrayList<>();



    @OneToOne
    @JoinColumn(name = "display_board_id")
    private DisplayBoard displayBoard;

    public void setId(Long id){
        super.setId(id);
    }

}
