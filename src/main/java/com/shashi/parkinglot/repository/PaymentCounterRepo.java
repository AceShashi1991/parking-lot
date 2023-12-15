package com.shashi.parkinglot.repository;

import com.shashi.parkinglot.model.PaymentCounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentCounterRepo extends JpaRepository<PaymentCounter,Long> {
}
