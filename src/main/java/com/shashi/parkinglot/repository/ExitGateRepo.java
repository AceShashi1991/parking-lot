package com.shashi.parkinglot.repository;

import com.shashi.parkinglot.model.gate.ExitGate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExitGateRepo extends JpaRepository<ExitGate,Long> {
}
