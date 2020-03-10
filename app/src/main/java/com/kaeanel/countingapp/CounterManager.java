package com.kaeanel.countingapp;

public class CounterManager {
    private final int numberToAdd = 1;

    public String addNumber(String counterNumber){

        int convertedNumber = Integer.parseInt(counterNumber) + numberToAdd;
        counterNumber = String.valueOf(convertedNumber);

        return counterNumber;
    }
}
