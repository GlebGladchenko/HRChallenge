package com.company;

import java.time.LocalDate;

public class DateAndTime {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
