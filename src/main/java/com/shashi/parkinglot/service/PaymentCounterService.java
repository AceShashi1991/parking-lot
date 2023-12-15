package com.shashi.parkinglot.service;

import com.shashi.parkinglot.model.PaymentCounter;
import com.shashi.parkinglot.repository.PaymentCounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentCounterService {

    @Autowired
    private PaymentCounterRepo paymentCounterRepo;

    public Optional<PaymentCounter> getPaymentCounterById(Long id){
        return paymentCounterRepo.findById(id);
    }

    public PaymentCounter createPaymentCounter(PaymentCounter paymentCounter){
        return paymentCounterRepo.save(paymentCounter);
    }
}
