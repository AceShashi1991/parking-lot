package com.shashi.parkinglot.controller;

import com.shashi.parkinglot.model.gate.ExitGate;
import com.shashi.parkinglot.service.ExitGateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/parking-lot/exit-gate/")
public class ExitGateController {

    @Autowired
    private ExitGateService exitGateService;
    @GetMapping("{id}")
    public ExitGate getEntryGate(@PathVariable Long id){
        return exitGateService.getExitGateById(id).orElseThrow();
    }


    @PostMapping
    public ExitGate createEntryGate(@RequestBody ExitGate exitGate){
        return exitGateService.create(exitGate);
    }
}
