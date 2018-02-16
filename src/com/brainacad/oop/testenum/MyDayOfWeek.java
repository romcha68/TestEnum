package com.brainacad.oop.testenum;

public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nextDay(){
        MyDayOfWeek[] days = values();
        return days[(this.ordinal() + 1) % days.length];
    }
}
