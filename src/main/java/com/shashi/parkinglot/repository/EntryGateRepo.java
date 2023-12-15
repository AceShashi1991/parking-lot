package com.shashi.parkinglot.repository;

import com.shashi.parkinglot.model.gate.EntryGate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryGateRepo extends JpaRepository<EntryGate,Long> {
}
