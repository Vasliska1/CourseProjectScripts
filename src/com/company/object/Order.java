package com.company.object;

import java.time.LocalDate;
import java.util.Random;

public class Order {


    private static final Random random = new Random();
    private static final LocalDate begin_date = LocalDate.of(2018, 10, 1);
    public static String generate() {
        return String.format(TEMPLATES, 2801 + random.nextInt(11000), generateRandomDate(), 1 + random.nextInt(1500), 1 + random.nextInt(2));
    }

    private static LocalDate generateRandomDate() {
        long start = begin_date.toEpochDay();
        long end = LocalDate.of(2021, 11, 1).toEpochDay();
        long current = start + random.nextInt((int) (end - start));
        return LocalDate.ofEpochDay(current);
    }

    private static final String TEMPLATES = "INSERT INTO order_(client_id, date_, factory_id, priority) VALUES(%s, '%s', %s, %s);";
}
