package com.shashi.parkinglot.controller;

import com.shashi.parkinglot.model.gate.EntryGate;
import com.shashi.parkinglot.service.EntryGateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/parking-lot/entry-gate/")
public class EntryGateController {

    @Autowired
    private EntryGateService entryGateService;
    @GetMapping("{id}")
    public EntryGate getEntryGate(@PathVariable Long id){
        return entryGateService.getEntryGateById(id).orElseThrow();
    }


    @PostMapping
    public EntryGate createEntryGate(@RequestBody EntryGate entryGate){
        return entryGateService.create(entryGate);
    }
}
