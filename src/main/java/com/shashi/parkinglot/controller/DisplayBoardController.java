package com.shashi.parkinglot.controller;

import com.shashi.parkinglot.model.DisplayBoard;
import com.shashi.parkinglot.service.DisplayBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/parking-lot/display-board/")
public class DisplayBoardController {

    @Autowired
    private DisplayBoardService displayBoardService;

    @GetMapping("{id}")
    public DisplayBoard getDisplayBoard(@PathVariable Integer id){
        return displayBoardService.getDisplayBoard(id).orElseThrow();
    }

    @PostMapping
    public DisplayBoard createDisplayBoard(@RequestBody DisplayBoard displayBoard){
        return displayBoardService.creteDisplayBoard(displayBoard);
    }
}
