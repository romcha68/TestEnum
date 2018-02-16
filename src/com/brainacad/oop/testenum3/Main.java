package com.brainacad.oop.testenum3;

public class Main {
    public static void main(String[] args) {
        TrainSchedule trainSchedule = new TrainSchedule(2);
        trainSchedule.addTrain();
        trainSchedule.printTrains();
        trainSchedule.searchTrain("Odessa", "Kiev", TrainSchedule.DayOfWeek.FRIDAY);
    }
}
