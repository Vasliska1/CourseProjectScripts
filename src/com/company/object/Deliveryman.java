package com.company.object;

import java.util.Random;

public class Deliveryman {


    private static final Random random = new Random();

    public static String generate() {
        return String.format(TEMPLATES, 1 + random.nextInt(2800), 1 + random.nextInt(1500), 1 + random.nextInt(3000));
    }

    private static final String TEMPLATES = "INSERT INTO deliveryman(human_id, district_id, car_id) VALUES(%s, %s, %s);";
}
