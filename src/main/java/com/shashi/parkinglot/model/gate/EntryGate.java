package com.shashi.parkinglot.model.gate;

import com.shashi.parkinglot.model.DisplayBoard;
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
public class EntryGate extends Gate{

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "display_board_id")
    private DisplayBoard displayBoard;

}
