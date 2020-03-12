package com.kaeanel.countingapp;

public class CounterManager {
    // The number which we're going to interact either adding or subtracting by it
    private final int numberToInteract = 1;
    private final int minimumCounterNumber = 0;

    public String addNumber(String counterNumber){

        int convertedNumber = Integer.parseInt(counterNumber) + numberToInteract;
        counterNumber = String.valueOf(convertedNumber);

        return counterNumber;
    }

    public String subtractNumber(String counterNumber){

        int convertedNumber = Integer.parseInt(counterNumber) - numberToInteract;
        counterNumber = String.valueOf(convertedNumber);

        return counterNumber;
    }

    public String restartCounter(){
        return String.valueOf(minimumCounterNumber);
    }
}
