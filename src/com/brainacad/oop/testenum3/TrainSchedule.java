package com.brainacad.oop.testenum3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TrainSchedule {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    class Train{
        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private DayOfWeek[] days;

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDays() {
            return days;
        }

        public void setDays(DayOfWeek[] days) {
            this.days = days;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("Train \n"
                    +"\tNo:" + number + "\n"
                    + "\tStation dispatch:" + stationDispatch + "\n"
                    + "\tStation arrival:" + stationArrival + "\n"
                    + "\tTime dispatch:" + timeDispatch + "\n"
                    + "\tTime arrival:" + timeArrival + "\n"
                    + "\tDays:");
            for(int i = 0; i < days.length; i++) {
                result.append(days[i]);
                if( i < days.length - 1) {
                    result.append(", ");
                }
            }

            return result.toString();
        }
    }

    private Train[] trains;
    private int index;

    public TrainSchedule(int size) {
        this.trains = new Train[size];
        this.index = 0;
    }

    public void addTrain() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Create new train: \n" +
                            "\tEnter train number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        Train train = new Train(number);

        System.out.print("\tEnter station dispatch: ");
        train.setStationDispatch(scanner.nextLine());

        System.out.print("\tEnter station arrival: ");
        train.setStationArrival(scanner.nextLine());

        System.out.print("\tEnter time dispatch: ");
        train.setTimeDispatch(scanner.nextLine());

        System.out.print("\tEnter time arrival: ");
        train.setTimeArrival(scanner.nextLine());

        System.out.print("\tEnter days (delimiter ,): ");
        String daysString = scanner.nextLine();
        String[] days = daysString.split(",");
        DayOfWeek[] trainDays = new DayOfWeek[days.length];

        for(int i = 0; i < days.length; i++) {
            trainDays[i] = DayOfWeek.valueOf(days[i].toUpperCase());
        }

        train.setDays(trainDays);

        trains[index] = train;
        index++;
    }

    public void printTrains() {
        for(Train train : trains) {
            if(train != null) {
                System.out.println(train);
            }
        }
    }

    public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek dayOfWeek) {
        for(Train train : trains) {
            if(train.getStationDispatch().equals(stationDispatch)
                    && train.getStationArrival().equals(stationArrival)) {
                for (DayOfWeek day : train.getDays()) {
                    if(day.equals(dayOfWeek)) {
                        System.out.println(train);
                        break;
                    }
                }
            }

        }
    }
}
