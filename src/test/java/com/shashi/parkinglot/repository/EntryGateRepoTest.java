package com.shashi.parkinglot.repository;

import com.shashi.parkinglot.model.DisplayBoard;
import com.shashi.parkinglot.model.gate.EntryGate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class EntryGateRepoTest {

    @Autowired
    private EntryGateRepo entryGateRepo;

    @Test
    public void savetest(){
        EntryGate entryGate = EntryGate.builder()
                .displayBoard(DisplayBoard.builder().build()).build();

        entryGateRepo.save(entryGate);
        assertNotNull(entryGate);
        assertNotNull(entryGate.getId());
        assertNotNull(entryGate.getDisplayBoard());
        assertNotNull(entryGate.getDisplayBoard().getId());
    }

}