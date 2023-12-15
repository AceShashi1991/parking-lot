package com.shashi.parkinglot.controller;

public class InvalidNoOfFloorsException extends Throwable {
    public InvalidNoOfFloorsException(String invalidNoOfFloors) {
        super(invalidNoOfFloors);
    }
}
