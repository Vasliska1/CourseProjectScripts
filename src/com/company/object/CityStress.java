package com.company.object;

import java.util.Random;

public class CityStress {


    private static final Random random = new Random();

    public static String generate() {
        return String.format(TEMPLATES, 1 + random.nextInt(320),1 + random.nextInt(5));
    }


    private static final String TEMPLATES = "INSERT INTO city_to_stress(city_id, stress_id) VALUES(%s, %s);";
}
