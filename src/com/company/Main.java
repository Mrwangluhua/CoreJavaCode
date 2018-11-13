package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate date = LocalDate.now();
        int mouth = date.getMonthValue();
        int year = date.getYear();
        int day = date.getDayOfMonth();
        System.out.println(date.minusDays(day-1));
    }
}
