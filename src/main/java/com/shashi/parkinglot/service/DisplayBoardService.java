package com.shashi.parkinglot.service;

import com.shashi.parkinglot.model.DisplayBoard;
import com.shashi.parkinglot.repository.DisplayBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DisplayBoardService {

    @Autowired
    DisplayBoardRepo displayBoardRepo;
    public Optional<DisplayBoard> getDisplayBoard(Integer id) {
        return displayBoardRepo.findById(id);
    }

    public DisplayBoard creteDisplayBoard(DisplayBoard displayBoard) {
        return displayBoardRepo.save(displayBoard);
    }
}
