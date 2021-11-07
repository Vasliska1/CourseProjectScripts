package com.company.object;

import java.util.Random;

public class Car {


    private static final Random random = new Random();
    private static final String TEMPLATES = "INSERT INTO car(number_) VALUES('%s');";

    public static String generate() {
        return String.format(TEMPLATES, number());
    }

    public static String number() {
        return String.valueOf("ВА" + 100 + random.nextInt(999) + "С");
    }
}
