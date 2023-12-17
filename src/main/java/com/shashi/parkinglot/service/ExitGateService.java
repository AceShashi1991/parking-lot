package com.shashi.parkinglot.service;

import com.shashi.parkinglot.model.gate.ExitGate;
import com.shashi.parkinglot.repository.ExitGateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExitGateService {

    @Autowired
    private ExitGateRepo exitGateRepo;

    public ExitGate create(ExitGate gate){
        return exitGateRepo.save(gate);
    }

    public List<ExitGate> createGates(List<ExitGate> gates){
        return exitGateRepo.saveAll(gates);
    }

    public Optional<ExitGate> getExitGateById(Long id) {
        return exitGateRepo.findById(id);
    }
}
