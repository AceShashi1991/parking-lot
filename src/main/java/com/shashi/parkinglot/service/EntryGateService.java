package com.shashi.parkinglot.service;

import com.shashi.parkinglot.model.gate.EntryGate;
import com.shashi.parkinglot.repository.EntryGateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryGateService {

    @Autowired
    private EntryGateRepo entryGateRepo;

    public Optional<EntryGate> getEntryGateById(Long id) {
        return entryGateRepo.findById(id);
    }

    public EntryGate create(EntryGate entryGate) {
        return entryGateRepo.save(entryGate);
    }

    public List<EntryGate> createGates(List<EntryGate> gates){
        return entryGateRepo.saveAll(gates);
    }
}
