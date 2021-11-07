package com.company.object;

import java.util.Random;

public class Factory {


    private static final Random random = new Random();
    public static int i = 1;

    public static String generate() {
        return String.format(TEMPLATES, i++);
    }

    private static final String TEMPLATES = "INSERT INTO factory(district_id) VALUES(%s);";
}
