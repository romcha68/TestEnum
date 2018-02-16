package com.brainacad.oop.testenum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        for(MyDayOfWeek day:MyDayOfWeek.values()){
            switch (day){
                case MONDAY:
                case THURSDAY:
                    System.out.println("My Java day: " + day);
                    break;
            }
        }

        System.out.println("Next day of week: " + MyDayOfWeek.MONDAY.nextDay());
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter day of week: ");
        System.out.println(MyDayOfWeek.valueOf(scr.nextLine().toUpperCase()).nextDay());
    }
}
