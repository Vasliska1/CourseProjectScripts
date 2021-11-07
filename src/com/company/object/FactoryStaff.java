package com.company.object;

import java.util.Random;

public class FactoryStaff {


    private static final Random random = new Random();

    public static String generate() {
        return String.format(TEMPLATES, 1 + random.nextInt(11000), 1 + random.nextInt(1500));
    }

    private static final String TEMPLATES = "INSERT INTO factory_staff(human_id, factory_id) VALUES(%s, %s);";
}
