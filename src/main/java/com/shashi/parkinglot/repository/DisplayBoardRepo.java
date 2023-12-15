package com.shashi.parkinglot.repository;


import com.shashi.parkinglot.model.DisplayBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayBoardRepo extends JpaRepository<DisplayBoard,Integer> {
}
