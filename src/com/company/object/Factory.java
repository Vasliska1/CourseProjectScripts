package com.company.object;

import java.util.Random;

public class Factory {


    private static final Random random = new Random();

    public static String generate() {
        return String.format(TEMPLATES, 1 + random.nextInt(1500));
    }

    private static final String TEMPLATES = "INSERT INTO factory(id_disctict) VALUES(%s);";
}
