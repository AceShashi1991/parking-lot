package com.shashi.parkinglot.controller;

import com.shashi.parkinglot.model.PaymentCounter;
import com.shashi.parkinglot.service.PaymentCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/parking-lot/payment-counter/")
public class PaymentCounterController {

    @Autowired
    private PaymentCounterService paymentCounterService;

    @GetMapping("{id}")
    public PaymentCounter getPaymentCounter(@PathVariable Long id){
        return paymentCounterService.getPaymentCounterById(id).orElseThrow();
    }


    @PostMapping
    public PaymentCounter createPaymentCounter(@RequestBody PaymentCounter paymentCounter){
        return paymentCounterService.createPaymentCounter(paymentCounter);
    }
}
