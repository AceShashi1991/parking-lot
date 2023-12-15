package com.shashi.parkinglot.repository;

import com.shashi.parkinglot.model.ParkingFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingFloorRepo extends JpaRepository<ParkingFloor,Long> {
}
