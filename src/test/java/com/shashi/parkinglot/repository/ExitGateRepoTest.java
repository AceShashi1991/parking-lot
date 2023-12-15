package com.shashi.parkinglot.repository;

import com.shashi.parkinglot.model.gate.ExitGate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class ExitGateRepoTest {

    @Autowired
    private ExitGateRepo exitGateRepo;

    @Test
    public void saveGatetest(){
        ExitGate exitGate = ExitGate.builder().build();
        exitGateRepo.save(exitGate);

        Assertions.assertThat(exitGate).isNotNull();
        Assertions.assertThat(exitGate.getId()).isNotNull();

    }

}