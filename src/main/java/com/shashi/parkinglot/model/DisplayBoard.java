package com.shashi.parkinglot.model;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DisplayBoard extends BaseEntity{

    private String name;
}
